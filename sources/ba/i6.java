package ba;

import android.text.SpannableString;
import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class i6 extends h6 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5019z;

    /* renamed from: y, reason: collision with root package name */
    public long f5020y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5019z = sparseIntArray;
        sparseIntArray.put(R.id.button_layout, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i6(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.i6.f5019z
            r2 = 7
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 6
            r0 = r9[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2
            r0 = r9[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 3
            r0 = r9[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 1
            r0 = r9[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 5
            r0 = r9[r0]
            r6 = r0
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r0 = 4
            r0 = r9[r0]
            r7 = r0
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f5020y = r0
            android.widget.TextView r0 = r10.f4895s
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4896t
            r0.setTag(r8)
            android.widget.ImageView r0 = r10.f4897u
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            com.google.android.material.button.MaterialButton r0 = r10.f4898v
            r0.setTag(r8)
            com.google.android.material.button.MaterialButton r0 = r10.f4899w
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.i6.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        int i10;
        String str2;
        SpannableString spannableString;
        String str3;
        synchronized (this) {
            j10 = this.f5020y;
            this.f5020y = 0L;
        }
        ci.c cVar = this.f4900x;
        long j11 = j10 & 6;
        if (j11 != 0 && cVar != null) {
            str = cVar.f8158d;
            str2 = cVar.f8156b;
            spannableString = cVar.f8157c;
            str3 = cVar.f8159e;
            i10 = cVar.f8155a;
        } else {
            str = null;
            i10 = 0;
            str2 = null;
            spannableString = null;
            str3 = null;
        }
        if (j11 != 0) {
            qu.i0.K(this.f4895s, str2);
            qu.i0.K(this.f4896t, spannableString);
            this.f4897u.setImageResource(i10);
            qu.i0.K(this.f4898v, str);
            qu.i0.K(this.f4899w, str3);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5020y != 0) {
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
            this.f5020y = 4L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
