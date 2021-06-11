/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.calcite.sql;

import org.apache.calcite.sql.parser.SqlParserPos;
import org.apache.calcite.sql.util.SqlVisitor;
import org.apache.calcite.sql.validate.SqlValidator;
import org.apache.calcite.sql.validate.SqlValidatorScope;
import org.apache.calcite.util.Litmus;

public class SqlLoadModel extends SqlNode {

  SqlNode path;
  SqlIdentifier modelName;

  public SqlLoadModel(SqlParserPos pos, SqlNode path, SqlIdentifier modelName) {
    super(pos);
    this.path = path;
    this.modelName = modelName;
  }

  @Override public SqlNode clone(SqlParserPos pos) {
    return null;
  }

  @Override public void unparse(SqlWriter writer, int leftPrec, int rightPrec) {

  }

  @Override public void validate(SqlValidator validator, SqlValidatorScope scope) {

  }

  @Override public <R> R accept(SqlVisitor<R> visitor) {
    return null;
  }

  @Override public boolean equalsDeep(SqlNode node, Litmus litmus) {
    return false;
  }
}
// End SqlLoadModel.java