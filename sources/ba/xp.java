package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class xp extends wp {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 4);
        sparseIntArray.put(R.id.collapsing_toolbar, 5);
        sparseIntArray.put(R.id.cl_top_container, 6);
        sparseIntArray.put(R.id.cl_top_section, 7);
        sparseIntArray.put(R.id.reported_user_banner_container, 8);
        sparseIntArray.put(R.id.reported_user_display_status, 9);
        sparseIntArray.put(R.id.user_image_view, 10);
        sparseIntArray.put(R.id.user_name_text, 11);
        sparseIntArray.put(R.id.user_name_id_text, 12);
        sparseIntArray.put(R.id.followers_click_reciever, 13);
        sparseIntArray.put(R.id.tv_no_of_followers_cta, 14);
        sparseIntArray.put(R.id.following_click_reciever, 15);
        sparseIntArray.put(R.id.btn_edit_follow_following, 16);
        sparseIntArray.put(R.id.tv_profile_bio, 17);
        sparseIntArray.put(R.id.reportedCompose, 18);
        sparseIntArray.put(R.id.swipe_refresh_layout, 19);
        sparseIntArray.put(R.id.stats_nested_scroll_view, 20);
        sparseIntArray.put(R.id.user_you_blocked, 21);
        sparseIntArray.put(R.id.imageView6, 22);
        sparseIntArray.put(R.id.tab_layout, 23);
        sparseIntArray.put(R.id.view_tab_layout, 24);
        sparseIntArray.put(R.id.my_profile_view_pager, 25);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xp(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.xp.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.J     // Catch: java.lang.Throwable -> Lba
            r2 = 0
            r15.J = r2     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lba
            com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel r4 = r15.I
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            r7 = 14
            r9 = 13
            if (r5 == 0) goto L6c
            long r11 = r0 & r9
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r11 = 0
            if (r5 == 0) goto L44
            if (r4 == 0) goto L22
            androidx.lifecycle.d0 r12 = r4.M
            goto L23
        L22:
            r12 = r11
        L23:
            r15.q(r6, r12)
            if (r12 == 0) goto L2f
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            goto L30
        L2f:
            r12 = r11
        L30:
            boolean r12 = m4.m.o(r12)
            if (r5 == 0) goto L3f
            if (r12 == 0) goto L3c
            r13 = 32
        L3a:
            long r0 = r0 | r13
            goto L3f
        L3c:
            r13 = 16
            goto L3a
        L3f:
            if (r12 == 0) goto L44
            r5 = 8
            goto L45
        L44:
            r5 = r6
        L45:
            long r12 = r0 & r7
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L69
            if (r4 == 0) goto L50
            androidx.lifecycle.e0 r4 = r4.f10059v
            goto L51
        L50:
            r4 = r11
        L51:
            r12 = 1
            r15.q(r12, r4)
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r4.getValue()
            r11 = r4
            com.assetgro.stockgro.data.model.ProfileStatsDto r11 = (com.assetgro.stockgro.data.model.ProfileStatsDto) r11
        L5e:
            if (r11 == 0) goto L69
            int r4 = r11.getFollowerCount()
            int r11 = r11.getFollowingCount()
            goto L6f
        L69:
            r4 = r6
            r11 = r4
            goto L6f
        L6c:
            r4 = r6
            r5 = r4
            r11 = r5
        L6f:
            long r7 = r7 & r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Laa
            com.google.android.material.textview.MaterialTextView r7 = r15.A
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            ij.h r8 = ij.h.f20067a
            if (r4 == 0) goto L88
            int r4 = r4.intValue()
            goto L89
        L88:
            r4 = r6
        L89:
            java.lang.String r4 = ij.h.f(r4, r6)
            r7.setText(r4)
            com.google.android.material.textview.MaterialTextView r4 = r15.B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r8)
            if (r7 == 0) goto La2
            int r7 = r7.intValue()
            goto La3
        La2:
            r7 = r6
        La3:
            java.lang.String r6 = ij.h.f(r7, r6)
            r4.setText(r6)
        Laa:
            long r0 = r0 & r9
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb9
            com.google.android.material.textview.MaterialTextView r0 = r15.B
            r0.setVisibility(r5)
            com.google.android.material.textview.MaterialTextView r0 = r15.C
            r0.setVisibility(r5)
        Lb9:
            return
        Lba:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lba
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.xp.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.J != 0) {
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
            this.J = 8L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }
}
