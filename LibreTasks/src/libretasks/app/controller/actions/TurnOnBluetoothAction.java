/*  
 * Copyright (c) 2016  LibreTasks - https://github.com/biotinker/LibreTasks  
 *  
 *  This file is free software: you may copy, redistribute and/or modify it  
 *  under the terms of the GNU General Public License as published by the  
 *  Free Software Foundation, either version 3 of the License, or (at your  
 *  option) any later version.  
 *  
 *  This file is distributed in the hope that it will be useful, but  
 *  WITHOUT ANY WARRANTY; without even the implied warranty of  
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU  
 *  General Public License for more details.  
 *  
 *  You should have received a copy of the GNU General Public License  
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.  
 *  
 * This file incorporates work covered by the following copyright and  
 * permission notice:  
 /*******************************************************************************
 * Copyright 2010 OmniDroid - http://code.google.com/p/omnidroid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package libretasks.app.controller.actions;

import java.util.HashMap;

import android.content.Intent;
import libretasks.app.controller.Action;
import libretasks.app.controller.external.actions.SignalsActionService;
import libretasks.app.controller.util.OmnidroidException;

/**
 * Simple action that turns wifi on
 *
 */
public class TurnOnBluetoothAction extends OmniAction {

  public static final String ACTION_NAME = "Turn On Bluetooth";
  public static final String APP_NAME = "Signals";
  public TurnOnBluetoothAction(HashMap<String, String> parameters) throws OmnidroidException {
    super(SignalsActionService.class.getName(), Action.BY_SERVICE);
  }

  @Override
  public Intent getIntent() {
    Intent intent = new Intent();
    intent.setClassName(LIBRETASKS_PACKAGE_NAME, SignalsActionService.class.getName());
    intent.putExtra(SignalsActionService.OPERATION_TYPE, SignalsActionService.TURN_ON_BLUETOOTH_ACTION);
    intent.putExtra(DATABASE_ID, databaseId);
    intent.putExtra(ACTION_TYPE, actionType);
    intent.putExtra(NOTIFICATION, showNotification);
    return intent;
  }
  
  @Override
  public String getDescription() {
	  return APP_NAME + "-" + ACTION_NAME;
  }

}
