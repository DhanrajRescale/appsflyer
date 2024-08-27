package s6;

import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h5.f;
import h5.g;
import h5.h;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import yk.j;

/* loaded from: classes.dex */
public abstract class a implements c, h5.e {

    /* renamed from: a, reason: collision with root package name */
    public final h f34300a;

    /* renamed from: f, reason: collision with root package name */
    public final g[] f34305f;

    /* renamed from: h, reason: collision with root package name */
    public int f34307h;

    /* renamed from: i, reason: collision with root package name */
    public f f34308i;

    /* renamed from: j, reason: collision with root package name */
    public SubtitleDecoderException f34309j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34310k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f34311l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34301b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f34302c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f34303d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final f[] f34304e = new d[2];

    /* renamed from: g, reason: collision with root package name */
    public int f34306g = 2;

    public a() {
        e[] eVarArr = new e[2];
        int i10 = 0;
        while (true) {
            if (i10 >= this.f34306g) {
                break;
            }
            this.f34304e[i10] = new f(1);
            i10++;
        }
        this.f34305f = eVarArr;
        this.f34307h = 2;
        for (int i11 = 0; i11 < this.f34307h; i11++) {
            this.f34305f[i11] = new t5.a(this, 1);
        }
        h hVar = new h(this);
        this.f34300a = hVar;
        hVar.start();
        int i12 = this.f34306g;
        f[] fVarArr = this.f34304e;
        j.H0(i12 == fVarArr.length);
        for (f fVar : fVarArr) {
            fVar.k(UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
    }

    @Override // s6.c
    public final void a(long j10) {
    }

    @Override // h5.e
    public final void b(d dVar) {
        boolean z10;
        synchronized (this.f34301b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f34309j;
                if (subtitleDecoderException == null) {
                    if (dVar == this.f34308i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j.E0(z10);
                    this.f34302c.addLast(dVar);
                    if (!this.f34302c.isEmpty() && this.f34307h > 0) {
                        this.f34301b.notify();
                    }
                    this.f34308i = null;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h5.e
    public final Object c() {
        synchronized (this.f34301b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f34309j;
                if (subtitleDecoderException == null) {
                    if (this.f34303d.isEmpty()) {
                        return null;
                    }
                    return (g) this.f34303d.removeFirst();
                }
                throw subtitleDecoderException;
            } finally {
            }
        }
    }

    @Override // h5.e
    public final Object d() {
        boolean z10;
        f fVar;
        synchronized (this.f34301b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f34309j;
                if (subtitleDecoderException == null) {
                    if (this.f34308i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j.H0(z10);
                    int i10 = this.f34306g;
                    if (i10 == 0) {
                        fVar = null;
                    } else {
                        f[] fVarArr = this.f34304e;
                        int i11 = i10 - 1;
                        this.f34306g = i11;
                        fVar = fVarArr[i11];
                    }
                    this.f34308i = fVar;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final SubtitleDecoderException e(f fVar, g gVar, boolean z10) {
        d dVar = (d) fVar;
        e eVar = (e) gVar;
        try {
            ByteBuffer byteBuffer = dVar.f18002d;
            byteBuffer.getClass();
            eVar.j(dVar.f18004f, f(byteBuffer.array(), byteBuffer.limit(), z10), dVar.f34312j);
            eVar.f17988b &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    public abstract b f(byte[] bArr, int i10, boolean z10);

    @Override // h5.e
    public final void flush() {
        synchronized (this.f34301b) {
            try {
                this.f34310k = true;
                f fVar = this.f34308i;
                if (fVar != null) {
                    fVar.i();
                    int i10 = this.f34306g;
                    this.f34306g = i10 + 1;
                    this.f34304e[i10] = fVar;
                    this.f34308i = null;
                }
                while (!this.f34302c.isEmpty()) {
                    f fVar2 = (f) this.f34302c.removeFirst();
                    fVar2.i();
                    int i11 = this.f34306g;
                    this.f34306g = i11 + 1;
                    this.f34304e[i11] = fVar2;
                }
                while (!this.f34303d.isEmpty()) {
                    ((g) this.f34303d.removeFirst()).i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f34301b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f34311l     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1d
            java.util.ArrayDeque r1 = r8.f34302c     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L14
            int r1 = r8.f34307h     // Catch: java.lang.Throwable -> L1a
            if (r1 <= 0) goto L14
            goto L1d
        L14:
            java.lang.Object r1 = r8.f34301b     // Catch: java.lang.Throwable -> L1a
            r1.wait()     // Catch: java.lang.Throwable -> L1a
            goto L3
        L1a:
            r1 = move-exception
            goto Laf
        L1d:
            boolean r1 = r8.f34311l     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto Lac
        L25:
            java.util.ArrayDeque r1 = r8.f34302c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L1a
            h5.f r1 = (h5.f) r1     // Catch: java.lang.Throwable -> L1a
            h5.g[] r3 = r8.f34305f     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.f34307h     // Catch: java.lang.Throwable -> L1a
            r5 = 1
            int r4 = r4 - r5
            r8.f34307h = r4     // Catch: java.lang.Throwable -> L1a
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r8.f34310k     // Catch: java.lang.Throwable -> L1a
            r8.f34310k = r2     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r0 = 4
            boolean r6 = r1.g(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L49
            r3.e(r0)
            goto L81
        L49:
            boolean r0 = r1.g(r7)
            if (r0 == 0) goto L52
            r3.e(r7)
        L52:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.g(r0)
            if (r6 == 0) goto L5d
            r3.e(r0)
        L5d:
            androidx.media3.extractor.text.SubtitleDecoderException r0 = r8.e(r1, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L62 java.lang.RuntimeException -> L6c
            goto L75
        L62:
            r0 = move-exception
            androidx.media3.extractor.text.SubtitleDecoderException r4 = new androidx.media3.extractor.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
        L6a:
            r0 = r4
            goto L75
        L6c:
            r0 = move-exception
            androidx.media3.extractor.text.SubtitleDecoderException r4 = new androidx.media3.extractor.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
            goto L6a
        L75:
            if (r0 == 0) goto L81
            java.lang.Object r4 = r8.f34301b
            monitor-enter(r4)
            r8.f34309j = r0     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7e
            goto Lac
        L7e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7e
            throw r0
        L81:
            java.lang.Object r2 = r8.f34301b
            monitor-enter(r2)
            boolean r0 = r8.f34310k     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8e
            r3.i()     // Catch: java.lang.Throwable -> L8c
            goto L9d
        L8c:
            r0 = move-exception
            goto Lad
        L8e:
            boolean r0 = r3.g(r7)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L98
            r3.i()     // Catch: java.lang.Throwable -> L8c
            goto L9d
        L98:
            java.util.ArrayDeque r0 = r8.f34303d     // Catch: java.lang.Throwable -> L8c
            r0.addLast(r3)     // Catch: java.lang.Throwable -> L8c
        L9d:
            r1.i()     // Catch: java.lang.Throwable -> L8c
            int r0 = r8.f34306g     // Catch: java.lang.Throwable -> L8c
            int r3 = r0 + 1
            r8.f34306g = r3     // Catch: java.lang.Throwable -> L8c
            h5.f[] r3 = r8.f34304e     // Catch: java.lang.Throwable -> L8c
            r3[r0] = r1     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8c
            r2 = r5
        Lac:
            return r2
        Lad:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8c
            throw r0
        Laf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.g():boolean");
    }

    @Override // h5.e
    public final void release() {
        synchronized (this.f34301b) {
            this.f34311l = true;
            this.f34301b.notify();
        }
        try {
            this.f34300a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
