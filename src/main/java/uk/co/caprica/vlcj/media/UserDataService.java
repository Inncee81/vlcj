/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2019 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.media;

// there is native api for this, but we don't need it

// FIXME isn't user data a client problem, maybe remove this?

public class UserDataService extends BaseService {

    private Object userData;

    UserDataService(Media media) {
        super(media);
    }

    /**
     * Get the userdata.
     *
     * @return userdata
     */
    public Object get() {
        return userData;
    }

    /**
     * Set the userdata.
     *
     * @param userData userdata
     */
    public void set(Object userData) {
        this.userData = userData;
    }

}
