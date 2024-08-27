package hs;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import h.b0;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import jr.h;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f18698d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f18699e = new Random();

    public static String m(String str) {
        String r10 = h.r(str.trim(), WebSocketProtocol.ACCEPT_MAGIC);
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(r10.getBytes());
            try {
                return ks.a.b(digest, digest.length);
            } catch (IOException unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int n(js.e eVar) {
        String d10 = ((b0) eVar).d("Sec-WebSocket-Version");
        if (d10.length() > 0) {
            try {
                return new Integer(d10.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [is.e, java.lang.Object] */
    public static is.e o(ByteBuffer byteBuffer) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        is.e eVar;
        int remaining = byteBuffer.remaining();
        int i12 = 2;
        if (remaining >= 2) {
            byte b10 = byteBuffer.get();
            if ((b10 >> 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte b11 = (byte) ((b10 & Byte.MAX_VALUE) >> 4);
            if (b11 == 0) {
                byte b12 = byteBuffer.get();
                if ((b12 & Byte.MIN_VALUE) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i13 = (byte) (b12 & Byte.MAX_VALUE);
                byte b13 = (byte) (b10 & 15);
                if (b13 != 0) {
                    if (b13 != 1) {
                        if (b13 != 2) {
                            switch (b13) {
                                case 8:
                                    i10 = 6;
                                    break;
                                case 9:
                                    i10 = 4;
                                    break;
                                case 10:
                                    i10 = 5;
                                    break;
                                default:
                                    throw new InvalidFrameException("unknow optcode " + ((int) b13));
                            }
                        } else {
                            i10 = 3;
                        }
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
                if (!z10 && (i10 == 4 || i10 == 5 || i10 == 6)) {
                    throw new InvalidFrameException("control frames may no be fragmented");
                }
                if (i13 < 0 || i13 > 125) {
                    if (i10 != 4 && i10 != 5 && i10 != 6) {
                        if (i13 == 126) {
                            if (remaining >= 4) {
                                i13 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                                i12 = 4;
                            } else {
                                throw new b(4);
                            }
                        } else {
                            i12 = 10;
                            if (remaining >= 10) {
                                byte[] bArr = new byte[8];
                                for (int i14 = 0; i14 < 8; i14++) {
                                    bArr[i14] = byteBuffer.get();
                                }
                                long longValue = new BigInteger(bArr).longValue();
                                if (longValue <= 2147483647L) {
                                    i13 = (int) longValue;
                                } else {
                                    throw new InvalidDataException(1009, "Payloadsize is to big...");
                                }
                            } else {
                                throw new b(10);
                            }
                        }
                    } else {
                        throw new InvalidFrameException("more than 125 octets");
                    }
                }
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i15 = i12 + i11 + i13;
                if (remaining >= i15) {
                    a.d(i13);
                    ByteBuffer allocate = ByteBuffer.allocate(i13);
                    if (z11) {
                        byte[] bArr2 = new byte[4];
                        byteBuffer.get(bArr2);
                        for (int i16 = 0; i16 < i13; i16++) {
                            allocate.put((byte) (byteBuffer.get() ^ bArr2[i16 % 4]));
                        }
                    } else {
                        allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                        byteBuffer.position(allocate.limit() + byteBuffer.position());
                    }
                    if (i10 == 6) {
                        is.e eVar2 = new is.e(6);
                        eVar2.f20526a = true;
                        eVar = eVar2;
                    } else {
                        ?? obj = new Object();
                        obj.f20526a = z10;
                        obj.f20527b = i10;
                        eVar = obj;
                    }
                    allocate.flip();
                    eVar.b(allocate);
                    return eVar;
                }
                throw new b(i15);
            }
            throw new InvalidFrameException(h.n("bad rsv ", b11));
        }
        throw new b(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hs.a
    public final int a(js.a aVar, js.f fVar) {
        b0 b0Var = (b0) aVar;
        if (b0Var.e("Sec-WebSocket-Key")) {
            b0 b0Var2 = (b0) fVar;
            if (b0Var2.e("Sec-WebSocket-Accept")) {
                if (m(b0Var.d("Sec-WebSocket-Key")).equals(b0Var2.d("Sec-WebSocket-Accept"))) {
                    return 1;
                }
            }
        }
        return 2;
    }

    @Override // hs.a
    public int b(js.a aVar) {
        int n10 = n(aVar);
        if ((n10 != 7 && n10 != 8) || !a.c(aVar)) {
            return 2;
        }
        return 1;
    }

    @Override // hs.a
    public final ByteBuffer e(is.d dVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        byte b10;
        int i13;
        ByteBuffer a10 = dVar.a();
        int i14 = 0;
        if (this.f18695a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a10.remaining() <= 125) {
            i10 = 1;
        } else if (a10.remaining() <= 65535) {
            i10 = 2;
        } else {
            i10 = 8;
        }
        if (i10 > 1) {
            i11 = i10 + 1;
        } else {
            i11 = i10;
        }
        int i15 = i11 + 1;
        if (z10) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(a10.remaining() + i15 + i12);
        is.e eVar = (is.e) dVar;
        int i16 = eVar.f20527b;
        if (i16 == 1) {
            b10 = 0;
        } else if (i16 == 2) {
            b10 = 1;
        } else if (i16 == 3) {
            b10 = 2;
        } else if (i16 == 6) {
            b10 = 8;
        } else if (i16 == 4) {
            b10 = 9;
        } else if (i16 == 5) {
            b10 = 10;
        } else {
            throw new RuntimeException("Don't know how to handle ".concat(da.e.z(i16)));
        }
        byte b11 = Byte.MIN_VALUE;
        if (eVar.f20526a) {
            i13 = -128;
        } else {
            i13 = 0;
        }
        allocate.put((byte) (((byte) i13) | b10));
        long remaining = a10.remaining();
        byte[] bArr = new byte[i10];
        int i17 = (i10 * 8) - 8;
        for (int i18 = 0; i18 < i10; i18++) {
            bArr[i18] = (byte) (remaining >>> (i17 - (i18 * 8)));
        }
        if (i10 == 1) {
            byte b12 = bArr[0];
            if (!z10) {
                b11 = 0;
            }
            allocate.put((byte) (b12 | b11));
        } else if (i10 == 2) {
            if (!z10) {
                b11 = 0;
            }
            allocate.put((byte) (b11 | 126));
            allocate.put(bArr);
        } else if (i10 == 8) {
            if (!z10) {
                b11 = 0;
            }
            allocate.put((byte) (b11 | Byte.MAX_VALUE));
            allocate.put(bArr);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z10) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f18699e.nextInt());
            allocate.put(allocate2.array());
            while (a10.hasRemaining()) {
                allocate.put((byte) (a10.get() ^ allocate2.get(i14 % 4)));
                i14++;
            }
        } else {
            allocate.put(a10);
        }
        allocate.flip();
        return allocate;
    }

    @Override // hs.a
    public final int f() {
        return 3;
    }

    @Override // hs.a
    public js.a g(js.c cVar) {
        String str;
        cVar.h("Upgrade", "websocket");
        cVar.h("Connection", "Upgrade");
        cVar.h("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f18699e.nextBytes(bArr);
        try {
            str = ks.a.b(bArr, 16);
        } catch (IOException unused) {
            str = null;
        }
        cVar.h("Sec-WebSocket-Key", str);
        return cVar;
    }

    @Override // hs.a
    public final void i() {
        this.f18698d = null;
    }

    @Override // hs.a
    public final List j(ByteBuffer byteBuffer) {
        LinkedList linkedList = new LinkedList();
        if (this.f18698d != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f18698d.remaining();
                if (remaining2 > remaining) {
                    this.f18698d.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f18698d.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(o((ByteBuffer) this.f18698d.duplicate().position(0)));
                this.f18698d = null;
            } catch (b e10) {
                this.f18698d.limit();
                int i10 = e10.f18697a;
                a.d(i10);
                ByteBuffer allocate = ByteBuffer.allocate(i10);
                this.f18698d.rewind();
                allocate.put(this.f18698d);
                this.f18698d = allocate;
                return j(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(o(byteBuffer));
            } catch (b e11) {
                byteBuffer.reset();
                int i11 = e11.f18697a;
                a.d(i11);
                ByteBuffer allocate2 = ByteBuffer.allocate(i11);
                this.f18698d = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }
}
