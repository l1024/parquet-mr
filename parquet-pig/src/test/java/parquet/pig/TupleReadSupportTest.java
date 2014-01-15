package parquet.pig;

import junit.framework.TestCase;
import org.apache.pig.impl.logicalLayer.schema.Schema;
import org.apache.pig.impl.util.Utils;
import org.junit.Test;

/**
 * Created by lorenz on 15/01/14.
 */
public class TupleReadSupportTest extends TestCase {

  @Test
  public void testUnion() throws Exception {

    Schema schema1 = Utils.getSchemaFromString("a: map[chararray]");
    Schema schema2 = Utils.getSchemaFromString("a: map[chararray]");
    String mergedSchemaString = TupleReadSupport.union(schema1, schema2).toString();
    Utils.getSchemaFromString(mergedSchemaString.substring(1, mergedSchemaString.length() - 1));
  }
}
