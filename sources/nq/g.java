package nq;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f29095a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final byte f29096b = Byte.parseByte("00001111", 2);

    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b10 = array[0];
        array[16] = b10;
        array[0] = (byte) ((b10 & f29096b) | f29095a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
