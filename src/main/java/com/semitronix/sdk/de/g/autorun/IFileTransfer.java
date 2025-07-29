package com.semitronix.sdk.de.g.autorun;

import java.io.InputStream;
import java.util.Map;

public interface IFileTransfer {
    void transfer(InputStream in, Map<String, Object> options) throws Exception;
}
