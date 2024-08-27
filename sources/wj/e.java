package wj;

import android.graphics.Bitmap;
import bk.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f39123a;

    /* renamed from: c, reason: collision with root package name */
    public final da.d f39125c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f39126d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f39127e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f39128f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f39129g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f39130h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f39131i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f39132j;

    /* renamed from: k, reason: collision with root package name */
    public int f39133k;

    /* renamed from: l, reason: collision with root package name */
    public c f39134l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f39135m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39136n;

    /* renamed from: o, reason: collision with root package name */
    public int f39137o;

    /* renamed from: p, reason: collision with root package name */
    public final int f39138p;

    /* renamed from: q, reason: collision with root package name */
    public final int f39139q;

    /* renamed from: r, reason: collision with root package name */
    public final int f39140r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f39141s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f39124b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f39142t = Bitmap.Config.ARGB_8888;

    public e(da.d dVar, c cVar, ByteBuffer byteBuffer, int i10) {
        int[] iArr;
        this.f39125c = dVar;
        this.f39134l = new c();
        synchronized (this) {
            try {
                if (i10 > 0) {
                    int highestOneBit = Integer.highestOneBit(i10);
                    this.f39137o = 0;
                    this.f39134l = cVar;
                    this.f39133k = -1;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    this.f39126d = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    this.f39126d.order(ByteOrder.LITTLE_ENDIAN);
                    this.f39136n = false;
                    Iterator it = cVar.f39112e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((b) it.next()).f39103g == 3) {
                            this.f39136n = true;
                            break;
                        }
                    }
                    this.f39138p = highestOneBit;
                    int i11 = cVar.f39113f;
                    this.f39140r = i11 / highestOneBit;
                    int i12 = cVar.f39114g;
                    this.f39139q = i12 / highestOneBit;
                    this.f39131i = this.f39125c.u(i11 * i12);
                    da.d dVar2 = this.f39125c;
                    int i13 = this.f39140r * this.f39139q;
                    Object obj = dVar2.f14277c;
                    if (((h) obj) == null) {
                        iArr = new int[i13];
                    } else {
                        iArr = (int[]) ((h) obj).c(i13, int[].class);
                    }
                    this.f39132j = iArr;
                } else {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap a() {
        Bitmap.Config config;
        Boolean bool = this.f39141s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f39142t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e10 = ((bk.d) this.f39125c.f14276b).e(this.f39140r, this.f39139q, config);
        e10.setHasAlpha(true);
        return e10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.Bitmap b() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.e.b():android.graphics.Bitmap");
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.f39142t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3.f39117j == r34.f39104h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(wj.b r34, wj.b r35) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.e.d(wj.b, wj.b):android.graphics.Bitmap");
    }
}
