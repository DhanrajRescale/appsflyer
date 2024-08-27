package com.assetgro.stockgro.ui.profile.self;

import ak.p;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import ba.tu;
import ba.u;
import ch.c;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.profile.self.ImagePreviewActivity;
import com.assetgro.stockgro.widget.ChipView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.f;
import ih.e;
import ih.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import m.v2;
import okhttp3.HttpUrl;
import qj.j;
import vc.b;
import yk.g;
import z4.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/self/EditProfileActivity;", "Lgd/f;", "Lcom/assetgro/stockgro/ui/profile/self/EditProfileViewModel;", "Lba/u;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EditProfileActivity extends f {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f10028o = 0;

    /* renamed from: n, reason: collision with root package name */
    public final int f10029n = 1001;

    public static final void S(EditProfileActivity editProfileActivity) {
        tu tuVar = ((u) editProfileActivity.w()).f6254w;
        tuVar.f6227s.setVisibility(0);
        tuVar.f6230v.setVisibility(8);
        String string = editProfileActivity.getString(R.string.text_unverified);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ChipView chipView = tuVar.f6231w;
        chipView.setChipText(string);
        chipView.setChipType(j.f32017a);
        ((u) editProfileActivity.w()).f6254w.f6232x.setVisibility(0);
    }

    public static final void T(EditProfileActivity editProfileActivity) {
        tu tuVar = ((u) editProfileActivity.w()).f6254w;
        RelativeLayout linkedinAuthContainer = tuVar.f6234z;
        Intrinsics.checkNotNullExpressionValue(linkedinAuthContainer, "linkedinAuthContainer");
        MaterialButton linkedInButton = tuVar.f6233y;
        Intrinsics.checkNotNullExpressionValue(linkedInButton, "linkedInButton");
        kj.f.r(true, linkedinAuthContainer, linkedInButton);
        tu tuVar2 = ((u) editProfileActivity.w()).f6254w;
        tuVar2.C.setVisibility(8);
        String string = editProfileActivity.getString(R.string.text_unverified);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ChipView chipView = tuVar2.D;
        chipView.setChipText(string);
        chipView.setChipType(j.f32017a);
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_edit_profile;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((EditProfileViewModel) x()).f9083f.observe(this, new c(8, new e(this, 5)));
        ((EditProfileViewModel) x()).f10034r.observe(this, new c(8, new e(this, 6)));
        ((EditProfileViewModel) x()).f9084g.observe(this, new c(8, new e(this, 7)));
        ((EditProfileViewModel) x()).f10037u.observe(this, new c(8, new e(this, 8)));
        EditProfileViewModel editProfileViewModel = (EditProfileViewModel) x();
        editProfileViewModel.B.observe(this, new c(8, new e(this, 9)));
        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) x();
        editProfileViewModel2.f10041y.observe(this, new c(8, new e(this, 10)));
        EditProfileViewModel editProfileViewModel3 = (EditProfileViewModel) x();
        editProfileViewModel3.A.observe(this, new c(8, new e(this, 11)));
        EditProfileViewModel editProfileViewModel4 = (EditProfileViewModel) x();
        editProfileViewModel4.C.observe(this, new c(8, new e(this, 12)));
        ((EditProfileViewModel) x()).f10036t.observe(this, new c(8, new e(this, 13)));
        ((EditProfileViewModel) x()).f10038v.observe(this, new c(8, new e(this, 0)));
        EditProfileViewModel editProfileViewModel5 = (EditProfileViewModel) x();
        editProfileViewModel5.D.observe(this, new c(8, new e(this, 1)));
        EditProfileViewModel editProfileViewModel6 = (EditProfileViewModel) x();
        editProfileViewModel6.E.observe(this, new c(8, new e(this, 2)));
        ((EditProfileViewModel) x()).f10040x.observe(this, new c(8, new e(this, 3)));
        ((EditProfileViewModel) x()).f10039w.observe(this, new c(8, new e(this, 4)));
    }

    @Override // gd.b
    public final void I() {
        ((EditProfileViewModel) x()).f10033q.postValue(Boolean.FALSE);
        ((EditProfileViewModel) x()).i();
        EditProfileViewModel editProfileViewModel = (EditProfileViewModel) x();
        a f10 = u0.f(editProfileViewModel);
        i iVar = new i(editProfileViewModel, null);
        final int i10 = 3;
        g.H(f10, null, null, iVar, 3);
        final int i11 = 0;
        this.f17266k.d(this.f17267l, new eb.f(this, 0));
        u uVar = (u) w();
        uVar.A.setOnRefreshListener(new b(this, 22));
        u uVar2 = (u) w();
        String stringExtra = getIntent().getStringExtra("BIO_VALUE");
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (stringExtra == null) {
            stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        uVar2.f6250s.setDisplayValue(stringExtra);
        e0 e0Var = ((EditProfileViewModel) x()).f10042z;
        String stringExtra2 = getIntent().getStringExtra("BIO_VALUE");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        e0Var.setValue(str);
        kj.f.n(((u) w()).f6250s.getInputEditText(), new e(this, 14));
        u uVar3 = (u) w();
        uVar3.f6257z.setOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                EditProfileActivity this$0 = this.f19992b;
                switch (i12) {
                    case 0:
                        int i13 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i14 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i15 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i16 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i17 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        final int i12 = 6;
        ((u) w()).f6250s.getInputEditText().addTextChangedListener(new v2(this, i12));
        u uVar4 = (u) w();
        final int i13 = 1;
        uVar4.f6251t.setOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i13;
                EditProfileActivity this$0 = this.f19992b;
                switch (i122) {
                    case 0:
                        int i132 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i14 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i15 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i16 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i17 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        u uVar5 = (u) w();
        uVar5.B.setTitle(getString(R.string.edit_profile));
        u uVar6 = (u) w();
        final int i14 = 2;
        uVar6.B.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i14;
                EditProfileActivity this$0 = this.f19992b;
                switch (i122) {
                    case 0:
                        int i132 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i142 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i15 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i16 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i17 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        Toolbar toolbar = ((u) w()).B;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u uVar7 = (u) w();
        uVar7.C.setOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i10;
                EditProfileActivity this$0 = this.f19992b;
                switch (i122) {
                    case 0:
                        int i132 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i142 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i15 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i16 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i17 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        u uVar8 = (u) w();
        final int i15 = 4;
        uVar8.f6253v.setOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i15;
                EditProfileActivity this$0 = this.f19992b;
                switch (i122) {
                    case 0:
                        int i132 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i142 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i152 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i16 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i17 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        u uVar9 = (u) w();
        final int i16 = 5;
        uVar9.B.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i16;
                EditProfileActivity this$0 = this.f19992b;
                switch (i122) {
                    case 0:
                        int i132 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i142 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i152 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i162 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i17 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        ((u) w()).f6254w.f6232x.setOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                EditProfileActivity this$0 = this.f19992b;
                switch (i122) {
                    case 0:
                        int i132 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i142 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i152 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i162 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i17 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        final int i17 = 7;
        ((u) w()).f6254w.f6233y.setOnClickListener(new View.OnClickListener(this) { // from class: ih.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f19992b;

            {
                this.f19992b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i17;
                EditProfileActivity this$0 = this.f19992b;
                switch (i122) {
                    case 0:
                        int i132 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String inputValue = ((u) this$0.w()).f6256y.getInputValue();
                        ((u) this$0.w()).f6256y.m();
                        String inputValue2 = ((u) this$0.w()).f6250s.getInputValue();
                        ((u) this$0.w()).f6250s.m();
                        EditProfileViewModel editProfileViewModel2 = (EditProfileViewModel) this$0.x();
                        e0 e0Var2 = editProfileViewModel2.f9084g;
                        Boolean bool = Boolean.TRUE;
                        e0Var2.postValue(bool);
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            editProfileViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else if (Intrinsics.a(inputValue, editProfileViewModel2.f10041y.getValue()) && Intrinsics.a(inputValue2, editProfileViewModel2.f10042z.getValue())) {
                            editProfileViewModel2.f10036t.postValue(bool);
                            e0Var2.postValue(Boolean.FALSE);
                            return;
                        } else {
                            yk.g.H(u0.f(editProfileViewModel2), null, null, new j(editProfileViewModel2, inputValue2, inputValue, null), 3);
                            return;
                        }
                    case 1:
                        int i142 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        new b().show(this$0.getSupportFragmentManager(), "DeleteAccountBottomSheetFragment");
                        return;
                    case 2:
                        int i152 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 3:
                        int i162 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent.putExtra("IMAGE_URL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    case 4:
                        int i172 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str3 = (String) ((EditProfileViewModel) this$0.x()).B.getValue();
                        if (str3 != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) ImagePreviewActivity.class);
                            intent2.putExtra("IMAGE_URL", str3);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 5:
                        int i18 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.onBackPressed();
                        return;
                    case 6:
                        int i19 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i20 = EditProfileActivity.f10028o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        u uVar10 = (u) w();
        uVar10.f6256y.setOnInputViewAction(new eb.f(this, 4));
    }

    @Override // gd.f
    public final void L() {
    }

    @Override // gd.f
    public final String M() {
        String currentUserId = ((EditProfileViewModel) x()).f9081d.getCurrentUserId();
        if (currentUserId == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return currentUserId;
    }

    @Override // gd.f
    public final void N() {
        ((EditProfileViewModel) x()).h();
    }

    @Override // gd.f
    public final void O() {
        EditProfileViewModel.j();
    }

    @Override // gd.f
    public final void P(SocialDataDto socialDataDto) {
        Intrinsics.checkNotNullParameter(socialDataDto, "socialDataDto");
        Intrinsics.checkNotNullParameter("linkedin", "platform");
        ((EditProfileViewModel) x()).k(socialDataDto, "linkedin");
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("UPDATED_USER_NAME", ((EditProfileViewModel) x()).f10031o);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 == this.f10029n) {
            int length = permissions.length;
            boolean z10 = true;
            boolean z11 = false;
            for (int i11 = 0; i11 < length; i11++) {
                String str = permissions[i11];
                int i12 = grantResults[i11];
                if (Intrinsics.a(str, "android.permission.CAMERA")) {
                    if (i12 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else if (i12 != 0) {
                    z10 = false;
                }
            }
            if (!z10 || !z11) {
                J("Camera and Gallery Permissions required");
            }
        }
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        nk.a p10 = ((nk.e) ((nk.e) new nk.a().f(p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
        Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
        nk.e eVar = (nk.e) p10;
        String str = (String) ((EditProfileViewModel) x()).B.getValue();
        if (str != null) {
            ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.c(this).f(this).m(str).w(eVar).i()).l(R.drawable.ic_placeholder_user)).z(((u) w()).C);
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.d();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
    }
}
