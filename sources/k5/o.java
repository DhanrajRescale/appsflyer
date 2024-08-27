package k5;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final n f22164a;

    /* renamed from: b, reason: collision with root package name */
    public int f22165b;

    /* renamed from: c, reason: collision with root package name */
    public long f22166c;

    /* renamed from: d, reason: collision with root package name */
    public long f22167d;

    /* renamed from: e, reason: collision with root package name */
    public long f22168e;

    /* renamed from: f, reason: collision with root package name */
    public long f22169f;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k5.n] */
    public o(AudioTrack audioTrack) {
        if (e5.x.f15050a >= 19) {
            ?? obj = new Object();
            obj.f22162d = audioTrack;
            obj.f22163e = new AudioTimestamp();
            this.f22164a = obj;
            a();
            return;
        }
        this.f22164a = null;
        b(3);
    }

    public final void a() {
        if (this.f22164a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f22165b = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f22167d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f22167d = 10000000L;
                return;
            }
            this.f22167d = 10000L;
            return;
        }
        this.f22168e = 0L;
        this.f22169f = -1L;
        this.f22166c = System.nanoTime() / 1000;
        this.f22167d = 10000L;
    }
}
