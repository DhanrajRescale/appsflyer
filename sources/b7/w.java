package b7;

import android.view.View;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;
import k7.t0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4040a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f4041b;

    /* renamed from: c, reason: collision with root package name */
    public int f4042c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4043d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4044e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4045f;

    public w(int i10) {
        this.f4041b = i10;
        byte[] bArr = new byte[131];
        this.f4045f = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f4043d) {
            return;
        }
        int i12 = i11 - i10;
        Object obj = this.f4045f;
        int length = ((byte[]) obj).length;
        int i13 = this.f4042c;
        if (length < i13 + i12) {
            this.f4045f = Arrays.copyOf((byte[]) obj, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f4045f, this.f4042c, i12);
        this.f4042c += i12;
    }

    public final void b() {
        int f10;
        if (this.f4043d) {
            f10 = ((t0) this.f4045f).e();
        } else {
            f10 = ((t0) this.f4045f).f();
        }
        this.f4042c = f10;
    }

    public final void c(View view, int i10) {
        if (this.f4043d) {
            this.f4042c = ((t0) this.f4045f).h() + ((t0) this.f4045f).b(view);
        } else {
            this.f4042c = ((t0) this.f4045f).d(view);
        }
        this.f4041b = i10;
    }

    public final void d(View view, int i10) {
        int h10 = ((t0) this.f4045f).h();
        if (h10 >= 0) {
            c(view, i10);
            return;
        }
        this.f4041b = i10;
        if (this.f4043d) {
            int e10 = (((t0) this.f4045f).e() - h10) - ((t0) this.f4045f).b(view);
            this.f4042c = ((t0) this.f4045f).e() - e10;
            if (e10 > 0) {
                int c10 = this.f4042c - ((t0) this.f4045f).c(view);
                int f10 = ((t0) this.f4045f).f();
                int min = c10 - (Math.min(((t0) this.f4045f).d(view) - f10, 0) + f10);
                if (min < 0) {
                    this.f4042c = Math.min(e10, -min) + this.f4042c;
                    return;
                }
                return;
            }
            return;
        }
        int d10 = ((t0) this.f4045f).d(view);
        int f11 = d10 - ((t0) this.f4045f).f();
        this.f4042c = d10;
        if (f11 > 0) {
            int e11 = (((t0) this.f4045f).e() - Math.min(0, (((t0) this.f4045f).e() - h10) - ((t0) this.f4045f).b(view))) - (((t0) this.f4045f).c(view) + d10);
            if (e11 < 0) {
                this.f4042c -= Math.min(f11, -e11);
            }
        }
    }

    public final boolean e(int i10) {
        if (!this.f4043d) {
            return false;
        }
        this.f4042c -= i10;
        this.f4043d = false;
        this.f4044e = true;
        return true;
    }

    public final void f() {
        switch (this.f4040a) {
            case 0:
                this.f4043d = false;
                this.f4044e = false;
                return;
            default:
                this.f4041b = -1;
                this.f4042c = Integer.MIN_VALUE;
                this.f4043d = false;
                this.f4044e = false;
                return;
        }
    }

    public final void g(int i10) {
        boolean z10 = true;
        yk.j.H0(!this.f4043d);
        if (i10 != this.f4041b) {
            z10 = false;
        }
        this.f4043d = z10;
        if (z10) {
            this.f4042c = 3;
            this.f4044e = false;
        }
    }

    public final String toString() {
        switch (this.f4040a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
                sb2.append(this.f4041b);
                sb2.append(", mCoordinate=");
                sb2.append(this.f4042c);
                sb2.append(", mLayoutFromEnd=");
                sb2.append(this.f4043d);
                sb2.append(", mValid=");
                return v.e.k(sb2, this.f4044e, UrlTreeKt.componentParamSuffixChar);
            default:
                return super.toString();
        }
    }

    public w() {
        f();
    }
}
