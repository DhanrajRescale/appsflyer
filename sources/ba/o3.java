package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class o3 extends n3 {
    public static final SparseIntArray Y;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(R.id.compose_view, 1);
        sparseIntArray.put(R.id.ria_app_bar_layout, 2);
        sparseIntArray.put(R.id.collapsing_toolbar_layout, 3);
        sparseIntArray.put(R.id.gradient_container_one, 4);
        sparseIntArray.put(R.id.gradient_container_two, 5);
        sparseIntArray.put(R.id.gradient_container_three, 6);
        sparseIntArray.put(R.id.gradient_container_mask, 7);
        sparseIntArray.put(R.id.overflow_menu_collapsable, 8);
        sparseIntArray.put(R.id.overflow_share_collapsable, 9);
        sparseIntArray.put(R.id.back_arrow, 10);
        sparseIntArray.put(R.id.ria_display_pic_collapsable_container, 11);
        sparseIntArray.put(R.id.ria_display_pic_collapsable, 12);
        sparseIntArray.put(R.id.is_sebi_verified_tag, 13);
        sparseIntArray.put(R.id.toolbar, 14);
        sparseIntArray.put(R.id.toolbar_container, 15);
        sparseIntArray.put(R.id.toolbar_back, 16);
        sparseIntArray.put(R.id.ria_display_pic_container, 17);
        sparseIntArray.put(R.id.ria_display_pic, 18);
        sparseIntArray.put(R.id.ria_name, 19);
        sparseIntArray.put(R.id.overflow_menu, 20);
        sparseIntArray.put(R.id.overflow_share, 21);
        sparseIntArray.put(R.id.nested_scroll_view, 22);
        sparseIntArray.put(R.id.view_ria_info, 23);
        sparseIntArray.put(R.id.ria_name_first, 24);
        sparseIntArray.put(R.id.ria_name_second, 25);
        sparseIntArray.put(R.id.ll_follow_unblock_button, 26);
        sparseIntArray.put(R.id.follow_following_button, 27);
        sparseIntArray.put(R.id.unblock_button, 28);
        sparseIntArray.put(R.id.ria_data, 29);
        sparseIntArray.put(R.id.user_name, 30);
        sparseIntArray.put(R.id.ria_description, 31);
        sparseIntArray.put(R.id.ria_basic_info, 32);
        sparseIntArray.put(R.id.ria_outline, 33);
        sparseIntArray.put(R.id.expertise, 34);
        sparseIntArray.put(R.id.expert_trade_view_widget, 35);
        sparseIntArray.put(R.id.block_parent_layout, 36);
        sparseIntArray.put(R.id.error_image, 37);
        sparseIntArray.put(R.id.error_description, 38);
        sparseIntArray.put(R.id.compose_view_ria_socials, 39);
        sparseIntArray.put(R.id.footer_container, 40);
        sparseIntArray.put(R.id.footer_text, 41);
        sparseIntArray.put(R.id.footer_icon, 42);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o3(android.view.View r37) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.o3.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.X = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.X != 0) {
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
            this.X = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
