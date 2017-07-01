/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.aria.core.inf;

import com.arialyy.aria.util.CommonUtil;

/**
 * Created by AriaL on 2017/6/29.
 */
public abstract class AbsGroupTask<TASK_ENTITY extends AbsTaskEntity, ENTITY extends AbsGroupEntity>
    extends AbsTask<ENTITY> {

  protected TASK_ENTITY mTaskEntity;

  @Override public int getPercent() {
    return 0;
  }

  @Override public long getFileSize() {
    return 0;
  }

  @Override public String getConvertFileSize() {
    return null;
  }

  @Override public long getCurrentProgress() {
    return 0;
  }

  @Override public String getConvertCurrentProgress() {
    return null;
  }

  @Override public int getState() {
    return mEntity.getState();
  }

  @Override public String getExtendField() {
    return mEntity.getStr();
  }

  @Override public String getKey() {
    return mEntity.getGroupName();
  }

  @Override public boolean isRunning() {
    return false;
  }

  @Override public ENTITY getEntity() {
    return mEntity;
  }

  @Override public void removeRecord() {

  }
}
