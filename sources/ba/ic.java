package ba;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;

/* loaded from: classes.dex */
public final class ic extends hc {

    /* renamed from: x, reason: collision with root package name */
    public long f5027x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ic(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            r0 = 4
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r0, r6, r6)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f5027x = r0
            r0 = 0
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r6)
            android.widget.ImageView r0 = r8.f4930s
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f4931t
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f4932u
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ic.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j10 = this.f5027x;
            this.f5027x = 0L;
        }
        RiaProfileResponseDto.ExpertMeta.Outline outline = this.f4933v;
        long j11 = j10 & 3;
        if (j11 != 0 && outline != null) {
            str = outline.getTitle();
            str2 = outline.getIconUrl();
            str3 = outline.getValue();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j11 != 0) {
            zq.f.W(this.f4930s, str2);
            el.l.A0(this.f4931t, str);
            el.l.A0(this.f4932u, str3);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5027x != 0) {
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
            this.f5027x = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
