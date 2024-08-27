package j6;

import al.d;
import b5.q0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kp.e;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f21036d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f21037b = e.f23433c.newDecoder();

    /* renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f21038c = e.f23432b.newDecoder();

    @Override // al.d
    public final q0 d0(f6.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f21038c;
        CharsetDecoder charsetDecoder2 = this.f21037b;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new q0(new c(bArr, null, null));
        }
        Matcher matcher = f21036d.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String P1 = dp.b.P1(group);
                P1.getClass();
                if (!P1.equals("streamurl")) {
                    if (P1.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new q0(new c(bArr, str2, str3));
    }
}
