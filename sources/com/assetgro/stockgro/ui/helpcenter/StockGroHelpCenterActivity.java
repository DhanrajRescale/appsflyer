package com.assetgro.stockgro.ui.helpcenter;

import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.h1;
import b3.t;
import ba.s0;
import ba.u7;
import com.assetgro.stockgro.data.model.FileMetaData;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpCenterActivity;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.n;
import da.a;
import e.c;
import ea.k;
import ea.v;
import el.l;
import gd.b;
import ge.q;
import iu.a0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import m4.d;
import m4.m;
import nt.h;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/helpcenter/StockGroHelpCenterActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/helpcenter/StockGroHelpViewModel;", "Lba/s0;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGroHelpCenterActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9532l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final c f9533k;

    public StockGroHelpCenterActivity() {
        c registerForActivityResult = registerForActivityResult(new f.b(0), new t(this, 5));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9533k = registerForActivityResult;
    }

    public static final void K(StockGroHelpCenterActivity stockGroHelpCenterActivity) {
        ((s0) stockGroHelpCenterActivity.w()).f6030x.f6687u.setVisibility(8);
        ((s0) stockGroHelpCenterActivity.w()).f6030x.f6686t.setVisibility(0);
        ((s0) stockGroHelpCenterActivity.w()).f6030x.f6685s.setVisibility(0);
        ((s0) stockGroHelpCenterActivity.w()).f6030x.f6686t.removeAllViews();
        Iterator it = ((StockGroHelpViewModel) stockGroHelpCenterActivity.x()).f9538r.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            FileMetaData fileMetaData = (FileMetaData) it.next();
            LayoutInflater from = LayoutInflater.from(stockGroHelpCenterActivity);
            LinearLayout linearLayout = ((s0) stockGroHelpCenterActivity.w()).f6030x.f6686t;
            int i11 = u7.f6277u;
            DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
            u7 u7Var = (u7) m.g(from, R.layout.cell_attach_proof_image, linearLayout, false, null);
            Intrinsics.checkNotNullExpressionValue(u7Var, "inflate(...)");
            u7Var.f6278s.setText(fileMetaData.getFilename());
            u7Var.f6279t.setOnClickListener(new n(i10, 1, stockGroHelpCenterActivity));
            ((s0) stockGroHelpCenterActivity.w()).f6030x.f6686t.addView(u7Var.f27491e);
            i10++;
        }
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_help_center;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((StockGroHelpViewModel) x()).f9084g.observe(this, new re.d(10, new ff.b(this, 0)));
        ((StockGroHelpViewModel) x()).f9542v.observe(this, new re.d(10, new ff.b(this, 1)));
        ((StockGroHelpViewModel) x()).f9544x.observe(this, new re.d(10, new ff.b(this, 2)));
    }

    @Override // gd.b
    public final void I() {
        s0 s0Var = (s0) w();
        s0Var.A.setTitle(getString(R.string.text_write_to_us));
        Toolbar toolbar = ((s0) w()).A;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((s0) w()).A);
        s0 s0Var2 = (s0) w();
        final int i10 = 0;
        s0Var2.A.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ff.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockGroHelpCenterActivity f16053b;

            {
                this.f16053b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i11 = i10;
                StockGroHelpCenterActivity this$0 = this.f16053b;
                switch (i11) {
                    case 0:
                        int i12 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0);
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int checkSelfPermission = this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
                        int checkSelfPermission2 = this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                        if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                            this$0.f9533k.a(new String[]{"image/*"});
                            return;
                        } else {
                            dp.b.A1(this$0);
                            return;
                        }
                    case 2:
                        int i14 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f9533k.a(new String[]{"image/*"});
                        return;
                    default:
                        int i15 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((s0) this$0.w()).f6028v.getText().toString().length() == 0) {
                            ((s0) this$0.w()).f6029w.setVisibility(0);
                            z10 = false;
                        } else {
                            ((s0) this$0.w()).f6029w.setVisibility(8);
                            z10 = true;
                        }
                        String obj = ((s0) this$0.w()).f6026t.getText().toString();
                        if (obj.length() == 0) {
                            ((s0) this$0.w()).f6027u.setVisibility(0);
                            ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_required));
                            return;
                        }
                        int i16 = f.f23221a;
                        Intrinsics.checkNotNullParameter(obj, "<this>");
                        if (!TextUtils.isEmpty(obj) && Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
                            ((s0) this$0.w()).f6027u.setVisibility(8);
                            if (z10) {
                                ((StockGroHelpViewModel) this$0.x()).f9539s = ((s0) this$0.w()).f6028v.getText().toString();
                                ((StockGroHelpViewModel) this$0.x()).f9540t = ((s0) this$0.w()).f6026t.getText().toString();
                                StockGroHelpViewModel stockGroHelpViewModel = (StockGroHelpViewModel) this$0.x();
                                stockGroHelpViewModel.f9084g.postValue(Boolean.TRUE);
                                ArrayList arrayList = stockGroHelpViewModel.f9538r;
                                if (true ^ arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        File file = new File(((FileMetaData) it.next()).getPath());
                                        String assetId = UUID.randomUUID().toString();
                                        Intrinsics.checkNotNullExpressionValue(assetId, "toString(...)");
                                        Intrinsics.checkNotNullParameter(assetId, "assetId");
                                        h c10 = stockGroHelpViewModel.f9534n.uploadKycFaqAssets(assetId, file, "image/jpeg").c(((e) stockGroHelpViewModel.f9079b).J());
                                        jt.d dVar = new jt.d(new q(22, new c(stockGroHelpViewModel, 4)), new q(23, new c(stockGroHelpViewModel, 5)));
                                        c10.a(dVar);
                                        stockGroHelpViewModel.f9080c.c(dVar);
                                    }
                                    return;
                                }
                                stockGroHelpViewModel.i(stockGroHelpViewModel.f9540t, stockGroHelpViewModel.f9539s);
                                return;
                            }
                            return;
                        }
                        ((s0) this$0.w()).f6027u.setVisibility(0);
                        ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_invalid_email_id));
                        return;
                }
            }
        });
        ((s0) w()).f6031y.setText(((StockGroHelpViewModel) x()).f9081d.getUserPhoneNumber());
        ((s0) w()).f6031y.setEnabled(false);
        ((s0) w()).f6031y.setAlpha(l.s(false));
        final int i11 = 1;
        ((s0) w()).f6030x.f6687u.setOnClickListener(new View.OnClickListener(this) { // from class: ff.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockGroHelpCenterActivity f16053b;

            {
                this.f16053b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i112 = i11;
                StockGroHelpCenterActivity this$0 = this.f16053b;
                switch (i112) {
                    case 0:
                        int i12 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0);
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int checkSelfPermission = this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
                        int checkSelfPermission2 = this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                        if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                            this$0.f9533k.a(new String[]{"image/*"});
                            return;
                        } else {
                            dp.b.A1(this$0);
                            return;
                        }
                    case 2:
                        int i14 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f9533k.a(new String[]{"image/*"});
                        return;
                    default:
                        int i15 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((s0) this$0.w()).f6028v.getText().toString().length() == 0) {
                            ((s0) this$0.w()).f6029w.setVisibility(0);
                            z10 = false;
                        } else {
                            ((s0) this$0.w()).f6029w.setVisibility(8);
                            z10 = true;
                        }
                        String obj = ((s0) this$0.w()).f6026t.getText().toString();
                        if (obj.length() == 0) {
                            ((s0) this$0.w()).f6027u.setVisibility(0);
                            ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_required));
                            return;
                        }
                        int i16 = f.f23221a;
                        Intrinsics.checkNotNullParameter(obj, "<this>");
                        if (!TextUtils.isEmpty(obj) && Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
                            ((s0) this$0.w()).f6027u.setVisibility(8);
                            if (z10) {
                                ((StockGroHelpViewModel) this$0.x()).f9539s = ((s0) this$0.w()).f6028v.getText().toString();
                                ((StockGroHelpViewModel) this$0.x()).f9540t = ((s0) this$0.w()).f6026t.getText().toString();
                                StockGroHelpViewModel stockGroHelpViewModel = (StockGroHelpViewModel) this$0.x();
                                stockGroHelpViewModel.f9084g.postValue(Boolean.TRUE);
                                ArrayList arrayList = stockGroHelpViewModel.f9538r;
                                if (true ^ arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        File file = new File(((FileMetaData) it.next()).getPath());
                                        String assetId = UUID.randomUUID().toString();
                                        Intrinsics.checkNotNullExpressionValue(assetId, "toString(...)");
                                        Intrinsics.checkNotNullParameter(assetId, "assetId");
                                        h c10 = stockGroHelpViewModel.f9534n.uploadKycFaqAssets(assetId, file, "image/jpeg").c(((e) stockGroHelpViewModel.f9079b).J());
                                        jt.d dVar = new jt.d(new q(22, new c(stockGroHelpViewModel, 4)), new q(23, new c(stockGroHelpViewModel, 5)));
                                        c10.a(dVar);
                                        stockGroHelpViewModel.f9080c.c(dVar);
                                    }
                                    return;
                                }
                                stockGroHelpViewModel.i(stockGroHelpViewModel.f9540t, stockGroHelpViewModel.f9539s);
                                return;
                            }
                            return;
                        }
                        ((s0) this$0.w()).f6027u.setVisibility(0);
                        ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_invalid_email_id));
                        return;
                }
            }
        });
        final int i12 = 2;
        ((s0) w()).f6030x.f6685s.setOnClickListener(new View.OnClickListener(this) { // from class: ff.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockGroHelpCenterActivity f16053b;

            {
                this.f16053b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i112 = i12;
                StockGroHelpCenterActivity this$0 = this.f16053b;
                switch (i112) {
                    case 0:
                        int i122 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0);
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int checkSelfPermission = this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
                        int checkSelfPermission2 = this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                        if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                            this$0.f9533k.a(new String[]{"image/*"});
                            return;
                        } else {
                            dp.b.A1(this$0);
                            return;
                        }
                    case 2:
                        int i14 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f9533k.a(new String[]{"image/*"});
                        return;
                    default:
                        int i15 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((s0) this$0.w()).f6028v.getText().toString().length() == 0) {
                            ((s0) this$0.w()).f6029w.setVisibility(0);
                            z10 = false;
                        } else {
                            ((s0) this$0.w()).f6029w.setVisibility(8);
                            z10 = true;
                        }
                        String obj = ((s0) this$0.w()).f6026t.getText().toString();
                        if (obj.length() == 0) {
                            ((s0) this$0.w()).f6027u.setVisibility(0);
                            ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_required));
                            return;
                        }
                        int i16 = f.f23221a;
                        Intrinsics.checkNotNullParameter(obj, "<this>");
                        if (!TextUtils.isEmpty(obj) && Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
                            ((s0) this$0.w()).f6027u.setVisibility(8);
                            if (z10) {
                                ((StockGroHelpViewModel) this$0.x()).f9539s = ((s0) this$0.w()).f6028v.getText().toString();
                                ((StockGroHelpViewModel) this$0.x()).f9540t = ((s0) this$0.w()).f6026t.getText().toString();
                                StockGroHelpViewModel stockGroHelpViewModel = (StockGroHelpViewModel) this$0.x();
                                stockGroHelpViewModel.f9084g.postValue(Boolean.TRUE);
                                ArrayList arrayList = stockGroHelpViewModel.f9538r;
                                if (true ^ arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        File file = new File(((FileMetaData) it.next()).getPath());
                                        String assetId = UUID.randomUUID().toString();
                                        Intrinsics.checkNotNullExpressionValue(assetId, "toString(...)");
                                        Intrinsics.checkNotNullParameter(assetId, "assetId");
                                        h c10 = stockGroHelpViewModel.f9534n.uploadKycFaqAssets(assetId, file, "image/jpeg").c(((e) stockGroHelpViewModel.f9079b).J());
                                        jt.d dVar = new jt.d(new q(22, new c(stockGroHelpViewModel, 4)), new q(23, new c(stockGroHelpViewModel, 5)));
                                        c10.a(dVar);
                                        stockGroHelpViewModel.f9080c.c(dVar);
                                    }
                                    return;
                                }
                                stockGroHelpViewModel.i(stockGroHelpViewModel.f9540t, stockGroHelpViewModel.f9539s);
                                return;
                            }
                            return;
                        }
                        ((s0) this$0.w()).f6027u.setVisibility(0);
                        ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_invalid_email_id));
                        return;
                }
            }
        });
        s0 s0Var3 = (s0) w();
        final int i13 = 3;
        s0Var3.f6032z.setOnClickListener(new View.OnClickListener(this) { // from class: ff.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockGroHelpCenterActivity f16053b;

            {
                this.f16053b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i112 = i13;
                StockGroHelpCenterActivity this$0 = this.f16053b;
                switch (i112) {
                    case 0:
                        int i122 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(0);
                        this$0.finish();
                        return;
                    case 1:
                        int i132 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int checkSelfPermission = this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
                        int checkSelfPermission2 = this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                        if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                            this$0.f9533k.a(new String[]{"image/*"});
                            return;
                        } else {
                            dp.b.A1(this$0);
                            return;
                        }
                    case 2:
                        int i14 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f9533k.a(new String[]{"image/*"});
                        return;
                    default:
                        int i15 = StockGroHelpCenterActivity.f9532l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((s0) this$0.w()).f6028v.getText().toString().length() == 0) {
                            ((s0) this$0.w()).f6029w.setVisibility(0);
                            z10 = false;
                        } else {
                            ((s0) this$0.w()).f6029w.setVisibility(8);
                            z10 = true;
                        }
                        String obj = ((s0) this$0.w()).f6026t.getText().toString();
                        if (obj.length() == 0) {
                            ((s0) this$0.w()).f6027u.setVisibility(0);
                            ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_required));
                            return;
                        }
                        int i16 = f.f23221a;
                        Intrinsics.checkNotNullParameter(obj, "<this>");
                        if (!TextUtils.isEmpty(obj) && Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
                            ((s0) this$0.w()).f6027u.setVisibility(8);
                            if (z10) {
                                ((StockGroHelpViewModel) this$0.x()).f9539s = ((s0) this$0.w()).f6028v.getText().toString();
                                ((StockGroHelpViewModel) this$0.x()).f9540t = ((s0) this$0.w()).f6026t.getText().toString();
                                StockGroHelpViewModel stockGroHelpViewModel = (StockGroHelpViewModel) this$0.x();
                                stockGroHelpViewModel.f9084g.postValue(Boolean.TRUE);
                                ArrayList arrayList = stockGroHelpViewModel.f9538r;
                                if (true ^ arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        File file = new File(((FileMetaData) it.next()).getPath());
                                        String assetId = UUID.randomUUID().toString();
                                        Intrinsics.checkNotNullExpressionValue(assetId, "toString(...)");
                                        Intrinsics.checkNotNullParameter(assetId, "assetId");
                                        h c10 = stockGroHelpViewModel.f9534n.uploadKycFaqAssets(assetId, file, "image/jpeg").c(((e) stockGroHelpViewModel.f9079b).J());
                                        jt.d dVar = new jt.d(new q(22, new c(stockGroHelpViewModel, 4)), new q(23, new c(stockGroHelpViewModel, 5)));
                                        c10.a(dVar);
                                        stockGroHelpViewModel.f9080c.c(dVar);
                                    }
                                    return;
                                }
                                stockGroHelpViewModel.i(stockGroHelpViewModel.f9540t, stockGroHelpViewModel.f9539s);
                                return;
                            }
                            return;
                        }
                        ((s0) this$0.w()).f6027u.setVisibility(0);
                        ((s0) this$0.w()).f6027u.setText(this$0.getString(R.string.text_invalid_email_id));
                        return;
                }
            }
        });
        L();
    }

    public final void L() {
        ((s0) w()).f6030x.f6687u.setVisibility(0);
        ((s0) w()).f6030x.f6686t.setVisibility(8);
        ((s0) w()).f6030x.f6685s.setVisibility(8);
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        int length = permissions.length;
        boolean z10 = true;
        for (int i11 = 0; i11 < length; i11++) {
            if (grantResults[i11] != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f9533k.a(new String[]{"image/*"});
        } else {
            J("Gallery Permissions required");
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        PaymentRepository paymentRepository = activityComponent.f14246a.i();
        g.i(paymentRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        ca.c factory = new ca.c(a0.a(StockGroHelpViewModel.class), new k(schedulerProvider, compositeDisposable, userRepository, paymentRepository, 3));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, StockGroHelpViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockGroHelpViewModel.class, "<this>", StockGroHelpViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockGroHelpViewModel stockGroHelpViewModel = (StockGroHelpViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockGroHelpViewModel);
            this.f17254b = stockGroHelpViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
