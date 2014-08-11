/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kuujo.copycat.log.impl;

import java.util.Set;

/**
 * Combination of all snapshot data.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public class CombinedSnapshot {
  private final long term;
  private final Set<String> cluster;
  private final byte[] bytes;

  CombinedSnapshot(long term, Set<String> cluster, byte[] bytes) {
    this.term = term;
    this.cluster = cluster;
    this.bytes = bytes;
  }

  public long term() {
    return term;
  }

  public Set<String> cluster() {
    return cluster;
  }

  public byte[] bytes() {
    return bytes;
  }

}
