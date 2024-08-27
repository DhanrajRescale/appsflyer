package ba;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class i7 extends h7 {
    public static final SparseIntArray J;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.whats_new_prepzone, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i7(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.i7.J
            r2 = 9
            r11 = 0
            java.lang.Object[] r12 = m4.m.j(r14, r2, r11, r0)
            r0 = 3
            r0 = r12[r0]
            r3 = r0
            me.relex.circleindicator.CircleIndicator2 r3 = (me.relex.circleindicator.CircleIndicator2) r3
            r0 = 2
            r0 = r12[r0]
            r4 = r0
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 5
            r0 = r12[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 4
            r0 = r12[r0]
            r6 = r0
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r0 = 7
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 1
            r0 = r12[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 8
            r0 = r12[r0]
            r10 = r0
            com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget r10 = (com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget) r10
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.I = r0
            me.relex.circleindicator.CircleIndicator2 r0 = r13.f4901s
            r0.setTag(r11)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f4902t
            r0.setTag(r11)
            r0 = 0
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r13.H = r0
            r0.setTag(r11)
            android.widget.ImageView r0 = r13.f4903u
            r0.setTag(r11)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f4904v
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f4905w
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f4906x
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f4907y
            r0.setTag(r11)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.i7.<init>(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0148, code lost:
    
        if (r25 == 0) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.i7.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.I != 0) {
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
            this.I = 64L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }

    @Override // ba.h7
    public final void r(int i10) {
        this.F = i10;
        synchronized (this) {
            this.I |= 16;
        }
        a(5);
        m();
    }

    @Override // ba.h7
    public final void s(ArenaSection arenaSection) {
        this.E = arenaSection;
        synchronized (this) {
            this.I |= 4;
        }
        a(6);
        m();
    }
}
