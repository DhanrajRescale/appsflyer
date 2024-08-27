package hs;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import h.b0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class f extends e {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f18704i = {-1, 0};

    /* renamed from: h, reason: collision with root package name */
    public final Random f18705h = new Random();

    public static byte[] n(String str, String str2, byte[] bArr) {
        byte[] p10 = p(str);
        byte[] p11 = p(str2);
        try {
            return MessageDigest.getInstance("MD5").digest(new byte[]{p10[0], p10[1], p10[2], p10[3], p11[0], p11[1], p11[2], p11[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String o() {
        Random random = new Random();
        long nextInt = random.nextInt(12) + 1;
        String l10 = Long.toString((random.nextInt(Math.abs(new Long(4294967295L / nextInt).intValue())) + 1) * nextInt);
        int nextInt2 = random.nextInt(12) + 1;
        for (int i10 = 0; i10 < nextInt2; i10++) {
            int abs = Math.abs(random.nextInt(l10.length()));
            char nextInt3 = (char) (random.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            l10 = new StringBuilder(l10).insert(abs, nextInt3).toString();
        }
        for (int i11 = 0; i11 < nextInt; i11++) {
            l10 = new StringBuilder(l10).insert(Math.abs(random.nextInt(l10.length() - 1) + 1), " ").toString();
        }
        return l10;
    }

    public static byte[] p(String str) {
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", HttpUrl.FRAGMENT_ENCODE_SET));
            long length = str.split(" ").length - 1;
            if (length != 0) {
                long longValue = new Long(parseLong / length).longValue();
                return new byte[]{(byte) (longValue >> 24), (byte) ((longValue << 8) >> 24), (byte) ((longValue << 16) >> 24), (byte) ((longValue << 24) >> 24)};
            }
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hs.e, hs.a
    public final int a(js.a aVar, js.f fVar) {
        try {
            if (((b0) fVar).d("Sec-WebSocket-Origin").equals(((b0) aVar).d("Origin")) && a.c(fVar)) {
                byte[] bArr = (byte[]) ((b0) fVar).f17579a;
                if (bArr != null && bArr.length != 0) {
                    b0 b0Var = (b0) aVar;
                    if (!Arrays.equals(bArr, n(b0Var.d("Sec-WebSocket-Key1"), b0Var.d("Sec-WebSocket-Key2"), (byte[]) ((b0) aVar).f17579a))) {
                        return 2;
                    }
                    return 1;
                }
                throw new IncompleteHandshakeException();
            }
            return 2;
        } catch (InvalidHandshakeException e10) {
            throw new RuntimeException("bad handshakerequest", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hs.e, hs.a
    public final int b(js.a aVar) {
        b0 b0Var = (b0) aVar;
        if (b0Var.d("Upgrade").equals("WebSocket") && b0Var.d("Connection").contains("Upgrade") && b0Var.d("Sec-WebSocket-Key1").length() > 0 && !b0Var.d("Sec-WebSocket-Key2").isEmpty() && b0Var.e("Origin")) {
            return 1;
        }
        return 2;
    }

    @Override // hs.e, hs.a
    public final ByteBuffer e(is.d dVar) {
        if (((is.e) dVar).f20527b == 6) {
            return ByteBuffer.wrap(f18704i);
        }
        return super.e(dVar);
    }

    @Override // hs.e, hs.a
    public final int f() {
        return 2;
    }

    @Override // hs.e, hs.a
    public final js.a g(js.c cVar) {
        cVar.h("Upgrade", "WebSocket");
        cVar.h("Connection", "Upgrade");
        cVar.h("Sec-WebSocket-Key1", o());
        cVar.h("Sec-WebSocket-Key2", o());
        boolean e10 = cVar.e("Origin");
        Random random = this.f18705h;
        if (!e10) {
            cVar.h("Origin", "random" + random.nextInt());
        }
        byte[] bArr = new byte[8];
        random.nextBytes(bArr);
        cVar.f17579a = bArr;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [is.e, java.lang.Object, is.b] */
    @Override // hs.e, hs.a
    public final List j(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        List m10 = m(byteBuffer);
        if (m10 == null) {
            byteBuffer.reset();
            LinkedList linkedList = this.f18701e;
            this.f18700d = true;
            if (this.f18702f == null) {
                this.f18702f = ByteBuffer.allocate(2);
                if (byteBuffer.remaining() <= this.f18702f.remaining()) {
                    this.f18702f.put(byteBuffer);
                    if (!this.f18702f.hasRemaining()) {
                        if (Arrays.equals(this.f18702f.array(), f18704i)) {
                            ?? eVar = new is.e(6);
                            eVar.f20526a = true;
                            eVar.c(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, HttpUrl.FRAGMENT_ENCODE_SET);
                            linkedList.add(eVar);
                            return linkedList;
                        }
                        throw new InvalidFrameException();
                    }
                    this.f18701e = new LinkedList();
                    return linkedList;
                }
                throw new InvalidFrameException();
            }
            throw new InvalidFrameException();
        }
        return m10;
    }

    @Override // hs.a
    public final b0 k(ByteBuffer byteBuffer) {
        int i10;
        b0 l10 = a.l(byteBuffer, this.f18695a);
        if ((l10.e("Sec-WebSocket-Key1") || this.f18695a == 1) && !l10.e("Sec-WebSocket-Version")) {
            if (this.f18695a == 2) {
                i10 = 8;
            } else {
                i10 = 16;
            }
            byte[] bArr = new byte[i10];
            try {
                byteBuffer.get(bArr);
                l10.f17579a = bArr;
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return l10;
    }
}
