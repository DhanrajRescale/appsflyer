package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class vg extends ug {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.group_cover_image_layout, 1);
        sparseIntArray.put(R.id.group_cover_image_view, 2);
        sparseIntArray.put(R.id.group_display_image_layout, 3);
        sparseIntArray.put(R.id.group_display_image_view, 4);
        sparseIntArray.put(R.id.edit_group_display_image, 5);
        sparseIntArray.put(R.id.admin_setting, 6);
        sparseIntArray.put(R.id.switch_admin_setting, 7);
        sparseIntArray.put(R.id.group_name_text_view, 8);
        sparseIntArray.put(R.id.group_description_layout, 9);
        sparseIntArray.put(R.id.group_description_label, 10);
        sparseIntArray.put(R.id.group_description, 11);
        sparseIntArray.put(R.id.max_length_label, 12);
        sparseIntArray.put(R.id.privacy_type_input_view, 13);
        sparseIntArray.put(R.id.collection_type_input_view, 14);
        sparseIntArray.put(R.id.proceed, 15);
        sparseIntArray.put(R.id.progress_bar, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vg(android.view.View r18) {
        /*
            r17 = this;
            r13 = r17
            r14 = r18
            r1 = 0
            android.util.SparseIntArray r0 = ba.vg.D
            r2 = 17
            r15 = 0
            java.lang.Object[] r16 = m4.m.j(r14, r2, r15, r0)
            r0 = 6
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 14
            r0 = r16[r0]
            r3 = r0
            com.assetgro.stockgro.widget.InputView r3 = (com.assetgro.stockgro.widget.InputView) r3
            r0 = 5
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 1
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 2
            r0 = r16[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 11
            r0 = r16[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 10
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 9
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 3
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 4
            r0 = r16[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 8
            r0 = r16[r0]
            r8 = r0
            com.assetgro.stockgro.widget.InputView r8 = (com.assetgro.stockgro.widget.InputView) r8
            r0 = 12
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 13
            r0 = r16[r0]
            r9 = r0
            com.assetgro.stockgro.widget.InputView r9 = (com.assetgro.stockgro.widget.InputView) r9
            r0 = 15
            r0 = r16[r0]
            r10 = r0
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            r0 = 16
            r0 = r16[r0]
            r11 = r0
            android.widget.ProgressBar r11 = (android.widget.ProgressBar) r11
            r0 = 7
            r0 = r16[r0]
            r12 = r0
            androidx.appcompat.widget.SwitchCompat r12 = (androidx.appcompat.widget.SwitchCompat) r12
            r0 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.C = r0
            r0 = 0
            r0 = r16[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0.setTag(r15)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r17.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.vg.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
