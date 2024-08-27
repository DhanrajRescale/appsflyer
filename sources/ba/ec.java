package ba;

import android.widget.TextView;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;

/* loaded from: classes.dex */
public final class ec extends dc {

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4592v;

    /* renamed from: w, reason: collision with root package name */
    public long f4593w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ec(android.view.View r5) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = m4.m.j(r5, r0, r1, r1)
            r2 = 1
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r4.<init>(r1, r5, r2)
            r2 = -1
            r4.f4593w = r2
            r2 = 0
            r2 = r0[r2]
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setTag(r1)
            r2 = 2
            r0 = r0[r2]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f4592v = r0
            r0.setTag(r1)
            android.widget.ImageView r0 = r4.f4476s
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r5.setTag(r0, r4)
            r4.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ec.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.f4593w;
            this.f4593w = 0L;
        }
        RiaProfileResponseDto.ExpertMeta.BasicInfo basicInfo = this.f4477t;
        long j11 = j10 & 3;
        if (j11 != 0 && basicInfo != null) {
            str = basicInfo.getTitle();
            str2 = basicInfo.getIconUrl();
        } else {
            str = null;
            str2 = null;
        }
        if (j11 != 0) {
            el.l.A0(this.f4592v, str);
            zq.f.W(this.f4476s, str2);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4593w != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.f4593w = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
