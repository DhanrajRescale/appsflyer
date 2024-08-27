package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12003a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12004b;

    static {
        Charset.forName("US-ASCII");
        f12003a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12004b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length >= 0) {
                int i10 = (0 - 0) + length;
                if (i10 >= 0) {
                    if (i10 <= Integer.MAX_VALUE) {
                        return;
                    } else {
                        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }
                throw new IOException("Failed to parse the message.");
            }
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
