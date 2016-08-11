/*
 * Copyright (C) 2016  Hendrik Borghorst
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package andrompd.org.andrompd.mpdservice.mpdprotocol.mpddatabase;

public abstract class MPDFileEntry implements MPDGenericItem {
    protected String mPath;

    // FIXME to some date format of java
    protected String mLastModified;

    protected MPDFileEntry(String path) {
        mPath = path;
    }

    public void setPath(String path) {
        mPath = path;
    }

    public String getPath() {
        return mPath;
    }

    public void setLastModified(String lastModified) {
        mLastModified = lastModified;
    }

    public String getLastModified() {
        return mLastModified;
    }
}
