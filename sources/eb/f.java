package eb;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.e0;
import ba.f3;
import ba.hl;
import ba.p4;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterFragment;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.social.auth.SocialAuthActivity;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderViewModel;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderViewModel;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifySellOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifyStockSellViewModel;
import com.assetgro.stockgro.ui.stock.sell.StockSellFragment;
import com.assetgro.stockgro.ui.stock.sell.StockSellViewModel;
import com.assetgro.stockgro.widget.InputView;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import d4.b3;
import d4.d0;
import d4.d3;
import d4.n1;
import d4.u2;
import d4.v0;
import e4.y;
import h.r0;
import hk.z;
import i0.h1;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import w.b0;
import y.q1;

/* loaded from: classes.dex */
public final class f implements qj.s, qj.r, d0, h1, xk.o, qj.m, qj.d, o5.s, kk.a, y, qj.f {

    /* renamed from: a, reason: collision with root package name */
    public int f15308a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15309b;

    public /* synthetic */ f(int i10, Object[] objArr) {
        this.f15308a = i10;
        this.f15309b = objArr;
    }

    public static f q() {
        return new f(8);
    }

    public static void r(q7.b bVar) {
        bVar.c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.c("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.c("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static r0 u(q7.b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new n7.b("work_spec_id", "TEXT", null, 1, 1, true));
        hashMap.put("prerequisite_id", new n7.b("prerequisite_id", "TEXT", null, 2, 1, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new n7.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new n7.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        boolean z10 = false;
        hashSet2.add(new n7.e(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id", false));
        hashSet2.add(new n7.e(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id", false));
        n7.f fVar = new n7.f("Dependency", hashMap, hashSet, hashSet2);
        n7.f a10 = n7.f.a(bVar, "Dependency");
        if (!fVar.equals(a10)) {
            return new r0(z10, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new n7.b("id", "TEXT", null, 1, 1, true));
        hashMap2.put("state", new n7.b("state", "INTEGER", null, 0, 1, true));
        hashMap2.put("worker_class_name", new n7.b("worker_class_name", "TEXT", null, 0, 1, true));
        hashMap2.put("input_merger_class_name", new n7.b("input_merger_class_name", "TEXT", null, 0, 1, false));
        hashMap2.put("input", new n7.b("input", "BLOB", null, 0, 1, true));
        hashMap2.put("output", new n7.b("output", "BLOB", null, 0, 1, true));
        hashMap2.put("initial_delay", new n7.b("initial_delay", "INTEGER", null, 0, 1, true));
        hashMap2.put("interval_duration", new n7.b("interval_duration", "INTEGER", null, 0, 1, true));
        hashMap2.put("flex_duration", new n7.b("flex_duration", "INTEGER", null, 0, 1, true));
        hashMap2.put("run_attempt_count", new n7.b("run_attempt_count", "INTEGER", null, 0, 1, true));
        hashMap2.put("backoff_policy", new n7.b("backoff_policy", "INTEGER", null, 0, 1, true));
        hashMap2.put("backoff_delay_duration", new n7.b("backoff_delay_duration", "INTEGER", null, 0, 1, true));
        hashMap2.put("period_start_time", new n7.b("period_start_time", "INTEGER", null, 0, 1, true));
        hashMap2.put("minimum_retention_duration", new n7.b("minimum_retention_duration", "INTEGER", null, 0, 1, true));
        hashMap2.put("schedule_requested_at", new n7.b("schedule_requested_at", "INTEGER", null, 0, 1, true));
        hashMap2.put("run_in_foreground", new n7.b("run_in_foreground", "INTEGER", null, 0, 1, true));
        hashMap2.put("out_of_quota_policy", new n7.b("out_of_quota_policy", "INTEGER", null, 0, 1, true));
        hashMap2.put("required_network_type", new n7.b("required_network_type", "INTEGER", null, 0, 1, false));
        hashMap2.put("requires_charging", new n7.b("requires_charging", "INTEGER", null, 0, 1, true));
        hashMap2.put("requires_device_idle", new n7.b("requires_device_idle", "INTEGER", null, 0, 1, true));
        hashMap2.put("requires_battery_not_low", new n7.b("requires_battery_not_low", "INTEGER", null, 0, 1, true));
        hashMap2.put("requires_storage_not_low", new n7.b("requires_storage_not_low", "INTEGER", null, 0, 1, true));
        hashMap2.put("trigger_content_update_delay", new n7.b("trigger_content_update_delay", "INTEGER", null, 0, 1, true));
        hashMap2.put("trigger_max_content_delay", new n7.b("trigger_max_content_delay", "INTEGER", null, 0, 1, true));
        hashMap2.put("content_uri_triggers", new n7.b("content_uri_triggers", "BLOB", null, 0, 1, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new n7.e(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at", false));
        hashSet4.add(new n7.e(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time", false));
        n7.f fVar2 = new n7.f("WorkSpec", hashMap2, hashSet3, hashSet4);
        n7.f a11 = n7.f.a(bVar, "WorkSpec");
        if (!fVar2.equals(a11)) {
            return new r0(z10, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new n7.b("tag", "TEXT", null, 1, 1, true));
        hashMap3.put("work_spec_id", new n7.b("work_spec_id", "TEXT", null, 2, 1, true));
        boolean z11 = true;
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new n7.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new n7.e(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id", false));
        n7.f fVar3 = new n7.f("WorkTag", hashMap3, hashSet5, hashSet6);
        n7.f a12 = n7.f.a(bVar, "WorkTag");
        if (!fVar3.equals(a12)) {
            return new r0(z10, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new n7.b("work_spec_id", "TEXT", null, 1, 1, true));
        hashMap4.put("system_id", new n7.b("system_id", "INTEGER", null, 0, 1, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new n7.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        n7.f fVar4 = new n7.f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        n7.f a13 = n7.f.a(bVar, "SystemIdInfo");
        if (!fVar4.equals(a13)) {
            return new r0(z10, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new n7.b(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, 1, 1, true));
        hashMap5.put("work_spec_id", new n7.b("work_spec_id", "TEXT", null, 2, 1, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new n7.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new n7.e(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id", false));
        n7.f fVar5 = new n7.f("WorkName", hashMap5, hashSet8, hashSet9);
        n7.f a14 = n7.f.a(bVar, "WorkName");
        if (!fVar5.equals(a14)) {
            return new r0(z10, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new n7.b("work_spec_id", "TEXT", null, 1, 1, true));
        hashMap6.put("progress", new n7.b("progress", "BLOB", null, 0, 1, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new n7.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        n7.f fVar6 = new n7.f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        n7.f a15 = n7.f.a(bVar, "WorkProgress");
        if (!fVar6.equals(a15)) {
            return new r0(z10, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new n7.b("key", "TEXT", null, 1, 1, true));
        hashMap7.put("long_value", new n7.b("long_value", "INTEGER", null, 0, 1, false));
        n7.f fVar7 = new n7.f("Preference", hashMap7, new HashSet(0), new HashSet(0));
        n7.f a16 = n7.f.a(bVar, "Preference");
        if (!fVar7.equals(a16)) {
            return new r0(z10, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a16);
        }
        return new r0(z11, null);
    }

    @Override // o5.s
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f15309b) == null) {
            this.f15309b = new MediaCodecList(this.f15308a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f15309b)[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0220, code lost:
    
        if (v1.a.a(r0, i0.y1.f19272q) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if (v1.a.a(androidx.compose.ui.input.key.a.a(r12.getKeyCode()), i0.y1.f19262g) != false) goto L72;
     */
    @Override // i0.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0.g1 b(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.f.b(android.view.KeyEvent):i0.g1");
    }

    @Override // o5.s
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // e4.y
    public boolean d(View view) {
        ((BottomSheetBehavior) this.f15309b).D(this.f15308a);
        return true;
    }

    @Override // qj.m
    public void e(Dialog dialog) {
    }

    @Override // qj.r
    public void f(String orderType) {
        BigDecimal bigDecimal;
        tf.c cVar;
        int i10 = this.f15308a;
        Object obj = this.f15309b;
        switch (i10) {
            case 0:
                if (orderType != null) {
                    NameRegisterFragment nameRegisterFragment = (NameRegisterFragment) obj;
                    nameRegisterFragment.I(((hl) nameRegisterFragment.q()).f4951s.getInputValue());
                    return;
                }
                return;
            case 1:
                if (orderType != null) {
                    int i11 = od.e.f29968k;
                    ((od.e) obj).H(orderType);
                    return;
                }
                return;
            case 2:
                RechargeWalletActivity rechargeWalletActivity = (RechargeWalletActivity) obj;
                ((f3) rechargeWalletActivity.w()).f4662w.m();
                if (orderType != null && w.s(orderType, ((RechargeWalletViewModel) rechargeWalletActivity.x()).f9081d.getCountryPrefix(), false) && !((RechargeWalletViewModel) rechargeWalletActivity.x()).A) {
                    ((RechargeWalletViewModel) rechargeWalletActivity.x()).A = true;
                    rechargeWalletActivity.A(new AnalyticEvent("add_money_field_activity", new HashMap()));
                    return;
                }
                return;
            case 3:
                WithdrawalDetailViewModel withdrawalDetailViewModel = (WithdrawalDetailViewModel) ((WithdrawalDetailActivity) obj).x();
                withdrawalDetailViewModel.f9759o.getClass();
                if (orderType != null && orderType.length() == 0) {
                    cVar = new tf.c(new ij.p());
                } else {
                    if (orderType != null) {
                        bigDecimal = kotlin.text.q.d(orderType);
                    } else {
                        bigDecimal = null;
                    }
                    if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                        cVar = new tf.c(new ij.p());
                    } else {
                        cVar = new tf.c(new ij.p(R.string.error_enter_valid_amount, false));
                    }
                }
                withdrawalDetailViewModel.A.postValue(cVar);
                return;
            case 4:
                if (orderType != null) {
                    EditProfileActivity editProfileActivity = (EditProfileActivity) obj;
                    String inputValue = ((ba.u) editProfileActivity.w()).f6256y.getInputValue();
                    if (inputValue != null && inputValue.length() != 0) {
                        if (inputValue.length() >= 4 && inputValue.length() <= 30) {
                            InputView inputView = ((ba.u) editProfileActivity.w()).f6256y;
                            inputView.m();
                            inputView.setIcon(R.drawable.ic_success);
                            return;
                        } else {
                            ba.u uVar = (ba.u) editProfileActivity.w();
                            String string = editProfileActivity.getString(R.string.name_length_validation_message);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            InputView inputView2 = uVar.f6256y;
                            inputView2.setErrorText(string);
                            inputView2.n();
                            return;
                        }
                    }
                    ba.u uVar2 = (ba.u) editProfileActivity.w();
                    String string2 = editProfileActivity.getString(R.string.name_length_empty_validation_message);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    InputView inputView3 = uVar2.f6256y;
                    inputView3.setErrorText(string2);
                    inputView3.n();
                    return;
                }
                return;
            case 5:
                if (orderType != null) {
                    StockCoverOrderViewModel stockCoverOrderViewModel = (StockCoverOrderViewModel) ((StockCoverOrderFragment) obj).r();
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    stockCoverOrderViewModel.f10175q = orderType;
                    stockCoverOrderViewModel.f10177s.postValue(orderType);
                    return;
                }
                return;
            case 6:
                if (orderType != null) {
                    ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = (ModifyStockCoverOrderViewModel) ((ModifyStockCoverOrderFragment) obj).r();
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    e0 e0Var = modifyStockCoverOrderViewModel.f10325t;
                    if (!Intrinsics.a(orderType, (String) e0Var.getValue())) {
                        e0Var.postValue(orderType);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                if (orderType != null) {
                    ModifyStockSellViewModel modifyStockSellViewModel = (ModifyStockSellViewModel) ((ModifySellOrderFragment) obj).r();
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    e0 e0Var2 = modifyStockSellViewModel.f10341t;
                    if (!Intrinsics.a(orderType, (String) e0Var2.getValue())) {
                        e0Var2.postValue(orderType);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                if (orderType != null) {
                    StockSellViewModel stockSellViewModel = (StockSellViewModel) ((StockSellFragment) obj).r();
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    stockSellViewModel.f10401q = orderType;
                    stockSellViewModel.f10403s.postValue(orderType);
                    return;
                }
                return;
            default:
                ((Function1) obj).invoke(orderType);
                return;
        }
    }

    @Override // d4.d0
    public d3 g(View view, d3 d3Var) {
        boolean z10;
        int i10;
        b3 b3Var = d3Var.f13731a;
        int i11 = this.f15308a;
        boolean z11 = false;
        r2 = false;
        boolean z12 = false;
        boolean z13 = true;
        d3 d3Var2 = null;
        Object obj = this.f15309b;
        switch (i11) {
            case 0:
                int d10 = d3Var.d();
                int J = ((h.e0) obj).J(d3Var, null);
                if (d10 != J) {
                    int b10 = d3Var.b();
                    int c10 = d3Var.c();
                    int a10 = d3Var.a();
                    e.l lVar = new e.l(d3Var);
                    ((u2) lVar.f14641b).g(u3.c.b(b10, J, c10, a10));
                    d3Var = lVar.K();
                }
                return n1.i(view, d3Var);
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!c4.c.a(coordinatorLayout.f1484n, d3Var)) {
                    coordinatorLayout.f1484n = d3Var;
                    if (d3Var.d() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    coordinatorLayout.f1485o = z10;
                    if (z10 || coordinatorLayout.getBackground() != null) {
                        z13 = false;
                    }
                    coordinatorLayout.setWillNotDraw(z13);
                    if (!b3Var.n()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = coordinatorLayout.getChildAt(i12);
                            WeakHashMap weakHashMap = n1.f13788a;
                            if (!v0.b(childAt) || ((o3.e) childAt.getLayoutParams()).f29544a == null || !b3Var.n()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return d3Var;
            case 2:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                appBarLayout.getClass();
                WeakHashMap weakHashMap2 = n1.f13788a;
                if (v0.b(appBarLayout)) {
                    d3Var2 = d3Var;
                }
                if (!c4.c.a(appBarLayout.f11079g, d3Var2)) {
                    appBarLayout.f11079g = d3Var2;
                    if (appBarLayout.f11094v != null && appBarLayout.getTopInset() > 0) {
                        z12 = true;
                    }
                    appBarLayout.setWillNotDraw(!z12);
                    appBarLayout.requestLayout();
                }
                return d3Var;
            case 3:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
                collapsingToolbarLayout.getClass();
                WeakHashMap weakHashMap3 = n1.f13788a;
                if (!v0.b(collapsingToolbarLayout)) {
                    d3Var = null;
                }
                if (!c4.c.a(collapsingToolbarLayout.A, d3Var)) {
                    collapsingToolbarLayout.A = d3Var;
                    collapsingToolbarLayout.requestLayout();
                }
                return b3Var.c();
            case 4:
                ao.f fVar = (ao.f) obj;
                ao.e eVar = fVar.f2668m;
                if (eVar != null) {
                    fVar.f2661f.W.remove(eVar);
                }
                ao.e eVar2 = new ao.e(fVar.f2664i, d3Var);
                fVar.f2668m = eVar2;
                eVar2.b(fVar.getWindow());
                BottomSheetBehavior bottomSheetBehavior = fVar.f2661f;
                ao.e eVar3 = fVar.f2668m;
                ArrayList arrayList = bottomSheetBehavior.W;
                if (!arrayList.contains(eVar3)) {
                    arrayList.add(eVar3);
                }
                return d3Var;
            case 5:
                mo.v vVar = (mo.v) obj;
                if (vVar.f27956b == null) {
                    vVar.f27956b = new Rect();
                }
                vVar.f27956b.set(d3Var.b(), d3Var.d(), d3Var.c(), d3Var.a());
                mo.s sVar = ((NavigationView) vVar).f11398i;
                sVar.getClass();
                int d11 = d3Var.d();
                if (sVar.f27953y != d11) {
                    sVar.f27953y = d11;
                    if (sVar.f27930b.getChildCount() == 0 && sVar.f27951w) {
                        i10 = sVar.f27953y;
                    } else {
                        i10 = 0;
                    }
                    NavigationMenuView navigationMenuView = sVar.f27929a;
                    navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
                }
                NavigationMenuView navigationMenuView2 = sVar.f27929a;
                navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, d3Var.a());
                n1.b(sVar.f27930b, d3Var);
                if (!(!b3Var.k().equals(u3.c.f36703e)) || vVar.f27955a == null) {
                    z11 = true;
                }
                vVar.setWillNotDraw(z11);
                v0.k(vVar);
                return b3Var.c();
            default:
                wo.k kVar = (wo.k) obj;
                kVar.f39395n = d3Var.a();
                kVar.f39396o = d3Var.b();
                kVar.f39397p = d3Var.c();
                kVar.f();
                return d3Var;
        }
    }

    public void h(long j10) {
        int i10 = this.f15308a;
        Object obj = this.f15309b;
        if (i10 == ((long[]) obj).length) {
            this.f15309b = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        long[] jArr = (long[]) this.f15309b;
        int i11 = this.f15308a;
        this.f15308a = i11 + 1;
        jArr[i11] = j10;
    }

    @Override // o5.s
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // o5.s
    public int j() {
        if (((MediaCodecInfo[]) this.f15309b) == null) {
            this.f15309b = new MediaCodecList(this.f15308a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f15309b).length;
    }

    @Override // o5.s
    public boolean k() {
        return true;
    }

    @Override // kk.a
    public ak.e0 l(ak.e0 e0Var, xj.k kVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) e0Var.get()).compress((Bitmap.CompressFormat) this.f15309b, this.f15308a, byteArrayOutputStream);
        e0Var.b();
        return new z(byteArrayOutputStream.toByteArray());
    }

    @Override // qj.m
    public void m(Dialog dialog) {
        int i10 = this.f15308a;
        Object obj = this.f15309b;
        switch (i10) {
            case 0:
                ((GroupInfoViewModel) ((GroupInfoV2Fragment) obj).r()).m();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                UserProfileActivity userProfileActivity = (UserProfileActivity) obj;
                ComposeView reportedText = ((p4) userProfileActivity.w()).f5720u;
                Intrinsics.checkNotNullExpressionValue(reportedText, "reportedText");
                zq.f.m0(reportedText);
                p4 p4Var = (p4) userProfileActivity.w();
                be.b bVar = new be.b(userProfileActivity, 17);
                Object obj2 = b1.d.f3079a;
                p4Var.f5720u.setContent(new b1.c(bVar, true, -1742364838));
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }

    public Object n(q1 q1Var, float f10, float f11, z.d dVar, z.g gVar) {
        int i10 = this.f15308a;
        Object obj = this.f15309b;
        switch (i10) {
            case 0:
                Object a10 = z.l.a(q1Var, f10, w.e.b(s0.g.f34069a, f11), (b0) obj, dVar, gVar);
                if (a10 != zt.a.f42823a) {
                    return (z.a) a10;
                }
                return a10;
            default:
                Object b10 = z.l.b(q1Var, Math.signum(f11) * Math.abs(f10), f10, w.e.b(s0.g.f34069a, f11), (w.n) obj, dVar, gVar);
                if (b10 != zt.a.f42823a) {
                    return (z.a) b10;
                }
                return b10;
        }
    }

    @Override // qj.m
    public void o() {
    }

    public iq.a p() {
        return new iq.a(this.f15308a, (iq.d) this.f15309b);
    }

    public long s(int i10) {
        if (i10 >= 0 && i10 < this.f15308a) {
            return ((long[]) this.f15309b)[i10];
        }
        StringBuilder n10 = a3.a.n("Invalid index ", i10, ", size is ");
        n10.append(this.f15308a);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public void t(wl.d0 result) {
        xk.a aVar = result.f39167a;
        int i10 = this.f15308a;
        Object obj = this.f15309b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                ((EditProfileViewModel) ((EditProfileActivity) obj).x()).l(aVar);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(result, "result");
                EditProfileViewModel editProfileViewModel = ((SocialAuthActivity) obj).f10114n;
                if (editProfileViewModel != null) {
                    editProfileViewModel.l(aVar);
                    return;
                } else {
                    Intrinsics.k("editProfileViewModel");
                    throw null;
                }
            default:
                FacebookSignInHandler facebookSignInHandler = (FacebookSignInHandler) obj;
                facebookSignInHandler.h(am.d.b());
                da.d dVar = new da.d(20, facebookSignInHandler, result);
                String str = xk.z.f40475j;
                xk.z x10 = ek.e.x(aVar, dVar);
                Bundle bundle = new Bundle();
                bundle.putString("fields", "id,name,email,picture");
                Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                x10.f40482d = bundle;
                x10.d();
                return;
        }
    }

    public long v(z5.l lVar) {
        int i10 = 0;
        lVar.b(((e5.p) this.f15309b).f15036a, 0, 1, false);
        int i11 = ((e5.p) this.f15309b).f15036a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        lVar.b(((e5.p) this.f15309b).f15036a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (((e5.p) this.f15309b).f15036a[i10] & 255) + (i14 << 8);
        }
        this.f15308a = i13 + 1 + this.f15308a;
        return i14;
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.f15308a = i10;
        this.f15309b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        this(32, 1);
        if (i10 == 3) {
            this.f15309b = new e5.p(8);
            return;
        }
        if (i10 == 8) {
            this.f15309b = iq.d.f20481a;
            return;
        }
        if (i10 == 5) {
            this(Bitmap.CompressFormat.JPEG, 100);
        } else if (i10 != 6) {
        } else {
            this.f15309b = yk.q.f41719a;
        }
    }

    public /* synthetic */ f(int i10, int i11) {
        if (i11 != 9) {
            this.f15309b = new long[i10];
        } else {
            this.f15309b = new byte[i10];
            this.f15308a = 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FacebookSignInHandler facebookSignInHandler) {
        this(facebookSignInHandler, 2);
        this.f15308a = 2;
    }
}
