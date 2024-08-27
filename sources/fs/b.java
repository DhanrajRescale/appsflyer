package fs;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import hs.c;
import hs.d;
import hs.e;
import hs.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f16227m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f16228a;

    /* renamed from: d, reason: collision with root package name */
    public final vl.b f16231d;

    /* renamed from: e, reason: collision with root package name */
    public final hs.a f16232e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16233f;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f16229b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f16230c = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f16234g = 0;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f16235h = ByteBuffer.allocate(0);

    /* renamed from: i, reason: collision with root package name */
    public js.a f16236i = null;

    /* renamed from: j, reason: collision with root package name */
    public String f16237j = null;

    /* renamed from: k, reason: collision with root package name */
    public Integer f16238k = null;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f16239l = null;

    static {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new c());
        arrayList.add(new c());
        arrayList.add(new f());
        arrayList.add(new e());
    }

    public b(vl.b bVar, d dVar) {
        this.f16232e = null;
        if (bVar != null) {
            this.f16228a = new LinkedBlockingQueue();
            new LinkedBlockingQueue();
            this.f16231d = bVar;
            this.f16233f = 1;
            this.f16232e = new c();
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    public static int h(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        int limit = byteBuffer.limit();
        byte[] bArr = hs.a.f18694c;
        if (limit > bArr.length) {
            return 2;
        }
        if (byteBuffer.limit() >= bArr.length) {
            int i10 = 0;
            while (byteBuffer.hasRemaining()) {
                if (hs.a.f18694c[i10] != byteBuffer.get()) {
                    byteBuffer.reset();
                    return 2;
                }
                i10++;
            }
            return 1;
        }
        throw new IncompleteHandshakeException(bArr.length);
    }

    @Override // fs.a
    public final void a(is.d dVar) {
        this.f16228a.add(this.f16232e.e(dVar));
        this.f16231d.X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [is.e, is.d, is.b] */
    public final void b(int i10, String str, boolean z10) {
        int i11 = this.f16230c;
        if (i11 != 4 && i11 != 5) {
            if (i11 == 3) {
                if (i10 == 1006) {
                    this.f16230c = 4;
                    g(i10, str, false);
                    return;
                }
                if (this.f16232e.f() != 1) {
                    vl.b bVar = this.f16231d;
                    try {
                        if (!z10) {
                            try {
                                bVar.P();
                            } catch (RuntimeException e10) {
                                bVar.R(e10);
                            }
                        }
                        ?? eVar = new is.e(6);
                        eVar.f20526a = true;
                        eVar.c(i10, str);
                        a(eVar);
                    } catch (InvalidDataException e11) {
                        bVar.R(e11);
                        g(1006, "generated frame is invalid", false);
                    }
                }
                g(i10, str, z10);
            } else if (i10 == -3) {
                g(-3, str, true);
            } else {
                g(-1, str, false);
            }
            if (i10 == 1002) {
                g(i10, str, z10);
            }
            this.f16230c = 4;
            this.f16235h = null;
        }
    }

    public final synchronized void c(int i10, String str, boolean z10) {
        if (this.f16230c == 5) {
            return;
        }
        try {
            this.f16231d.O(i10, str);
        } catch (RuntimeException e10) {
            this.f16231d.R(e10);
        }
        hs.a aVar = this.f16232e;
        if (aVar != null) {
            aVar.i();
        }
        this.f16236i = null;
        this.f16230c = 5;
        this.f16228a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.nio.ByteBuffer r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fs.b.d(java.nio.ByteBuffer):void");
    }

    public final void e(ByteBuffer byteBuffer) {
        int i10;
        String str;
        vl.b bVar = this.f16231d;
        try {
        } catch (InvalidDataException e10) {
            bVar.R(e10);
            b(e10.f12112a, e10.getMessage(), false);
            return;
        }
        for (is.d dVar : this.f16232e.j(byteBuffer)) {
            int i11 = ((is.e) dVar).f20527b;
            boolean z10 = ((is.e) dVar).f20526a;
            if (i11 == 6) {
                if (dVar instanceof is.a) {
                    is.a aVar = (is.a) dVar;
                    i10 = ((is.b) aVar).f20523e;
                    str = ((is.b) aVar).f20524f;
                } else {
                    i10 = 1005;
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (this.f16230c == 4) {
                    c(i10, str, true);
                } else if (this.f16232e.f() == 3) {
                    b(i10, str, true);
                } else {
                    g(i10, str, false);
                }
            } else if (i11 == 4) {
                bVar.getClass();
                vl.b.W(this, dVar);
            } else if (i11 == 5) {
                bVar.getClass();
            } else {
                if (z10 && i11 != 1) {
                    if (this.f16234g == 0) {
                        if (i11 == 2) {
                            try {
                                bVar.T(ks.b.a(dVar.a()));
                            } catch (RuntimeException e11) {
                                bVar.R(e11);
                            }
                        } else if (i11 == 3) {
                            try {
                                dVar.a();
                                bVar.S();
                            } catch (RuntimeException e12) {
                                bVar.R(e12);
                            }
                        } else {
                            throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, "non control or continious frame expected");
                        }
                        bVar.R(e10);
                        b(e10.f12112a, e10.getMessage(), false);
                        return;
                    }
                    throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, "Continuous frame sequence not completed.");
                }
                if (i11 != 1) {
                    if (this.f16234g == 0) {
                        this.f16234g = i11;
                    } else {
                        throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, "Previous continuous frame sequence not completed.");
                    }
                } else if (z10) {
                    if (this.f16234g != 0) {
                        this.f16234g = 0;
                    } else {
                        throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, "Continuous frame sequence was not started.");
                    }
                } else if (this.f16234g == 0) {
                    throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, "Continuous frame sequence was not started.");
                }
                try {
                    bVar.U();
                } catch (RuntimeException e13) {
                    bVar.R(e13);
                }
            }
        }
    }

    public final void f() {
        if (this.f16230c == 1) {
            c(-1, HttpUrl.FRAGMENT_ENCODE_SET, true);
            return;
        }
        if (this.f16229b) {
            c(this.f16238k.intValue(), this.f16237j, this.f16239l.booleanValue());
            return;
        }
        if (this.f16232e.f() == 1) {
            c(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, HttpUrl.FRAGMENT_ENCODE_SET, true);
            return;
        }
        if (this.f16232e.f() == 2) {
            if (this.f16233f == 2) {
                c(1006, HttpUrl.FRAGMENT_ENCODE_SET, true);
                return;
            } else {
                c(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, HttpUrl.FRAGMENT_ENCODE_SET, true);
                return;
            }
        }
        c(1006, HttpUrl.FRAGMENT_ENCODE_SET, true);
    }

    public final synchronized void g(int i10, String str, boolean z10) {
        if (this.f16229b) {
            return;
        }
        this.f16238k = Integer.valueOf(i10);
        this.f16237j = str;
        this.f16239l = Boolean.valueOf(z10);
        this.f16229b = true;
        this.f16231d.X();
        try {
            this.f16231d.Q();
        } catch (RuntimeException e10) {
            this.f16231d.R(e10);
        }
        hs.a aVar = this.f16232e;
        if (aVar != null) {
            aVar.i();
        }
        this.f16236i = null;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return super.toString();
    }
}
