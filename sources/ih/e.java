package ih;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import ba.tu;
import ba.u;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.AuthUiModel;
import com.assetgro.stockgro.data.model.PlatformMeta;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.widget.ChipView;
import com.assetgro.stockgro.widget.InputView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileActivity f19994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(EditProfileActivity editProfileActivity, int i10) {
        super(1);
        this.f19993a = i10;
        this.f19994b = editProfileActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f19993a;
        EditProfileActivity context = this.f19994b;
        switch (i10) {
            case 1:
                if (bool != null && !bool.booleanValue()) {
                    EditProfileActivity.S(context);
                    EditProfileActivity.T(context);
                    return;
                }
                return;
            case 6:
                u uVar = (u) context.w();
                Intrinsics.c(bool);
                uVar.f6257z.setEnabled(bool.booleanValue());
                return;
            case 7:
                u uVar2 = (u) context.w();
                Intrinsics.c(bool);
                uVar2.A.setRefreshing(bool.booleanValue());
                return;
            case 8:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((u) context.w()).f6252u.setVisibility(0);
                    return;
                } else {
                    ((u) context.w()).f6252u.setVisibility(8);
                    return;
                }
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((u) context.w()).f6257z.setEnabled(false);
                    String text = context.getString(R.string.profile_updated_successfully);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        return;
                    }
                    return;
                }
                String text2 = context.getString(R.string.upload_failed);
                Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text2, "text");
                if (text2.length() != 0) {
                    Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService2 = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                    return;
                }
                return;
        }
    }

    public final void d(String it) {
        Unit unit;
        int i10 = this.f19993a;
        EditProfileActivity editProfileActivity = this.f19994b;
        switch (i10) {
            case 0:
                u uVar = (u) editProfileActivity.w();
                Intrinsics.c(it);
                uVar.f6256y.setErrorText(it);
                return;
            case 9:
                nk.a p10 = ((nk.e) ((nk.e) new nk.a().f(ak.p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
                Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.c(editProfileActivity).f(editProfileActivity).m(it).w((nk.e) p10).e()).i()).l(R.drawable.ic_placeholder_user)).p(new qk.b(((EditProfileViewModel) editProfileActivity.x()).f9081d.getUserImageSignature()))).z(((u) editProfileActivity.w()).C);
                return;
            case 10:
                ((u) editProfileActivity.w()).A.setEnabled(false);
                kj.f.n(((u) editProfileActivity.w()).f6256y.getInputEditText(), new zd.g(it, 15, editProfileActivity));
                u uVar2 = (u) editProfileActivity.w();
                Intrinsics.c(it);
                uVar2.f6256y.setDisplayValue(it);
                return;
            case 11:
                if (it != null) {
                    ((u) editProfileActivity.w()).D.setDisplayValue(it);
                    unit = Unit.f23355a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ((u) editProfileActivity.w()).D.setDisplayValue("No Username");
                    return;
                }
                return;
            case 12:
                u uVar3 = (u) editProfileActivity.w();
                Intrinsics.c(it);
                uVar3.f6255x.setDisplayValue(it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!Intrinsics.a(editProfileActivity.getIntent().getStringExtra("BIO_VALUE"), it)) {
                    ((EditProfileViewModel) editProfileActivity.x()).f10033q.postValue(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f19993a;
        EditProfileActivity editProfileActivity = this.f19994b;
        switch (i10) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                Map map = (Map) obj;
                if (map != null) {
                    if (map.containsKey("facebook")) {
                        PlatformMeta platformMeta = (PlatformMeta) map.get("facebook");
                        int i11 = EditProfileActivity.f10028o;
                        tu tuVar = ((u) editProfileActivity.w()).f6254w;
                        tuVar.f6227s.setVisibility(0);
                        tuVar.f6230v.setVisibility(0);
                        if (platformMeta != null) {
                            ((u) editProfileActivity.w()).f6254w.f6232x.setVisibility(8);
                            String userName = platformMeta.getUserName();
                            if (userName != null) {
                                InputView inputView = tuVar.f6228t;
                                inputView.setVisibility(0);
                                inputView.setDisplayValue(userName);
                                inputView.o();
                            }
                            String email = platformMeta.getEmail();
                            if (email != null) {
                                InputView inputView2 = tuVar.f6229u;
                                inputView2.setVisibility(0);
                                inputView2.setDisplayValue(email);
                                inputView2.o();
                            }
                            String string = editProfileActivity.getString(R.string.text_verified);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            ChipView chipView = tuVar.f6231w;
                            chipView.setChipText(string);
                            chipView.setChipType(qj.j.f32018b);
                        }
                    } else {
                        EditProfileActivity.S(editProfileActivity);
                    }
                    if (map.containsKey("linkedin")) {
                        PlatformMeta platformMeta2 = (PlatformMeta) map.get("linkedin");
                        tu tuVar2 = ((u) editProfileActivity.w()).f6254w;
                        RelativeLayout linkedinAuthContainer = tuVar2.f6234z;
                        Intrinsics.checkNotNullExpressionValue(linkedinAuthContainer, "linkedinAuthContainer");
                        RelativeLayout linkedinHeader = tuVar2.C;
                        Intrinsics.checkNotNullExpressionValue(linkedinHeader, "linkedinHeader");
                        kj.f.r(true, linkedinAuthContainer, linkedinHeader);
                        if (platformMeta2 != null) {
                            ((u) editProfileActivity.w()).f6254w.f6233y.setVisibility(8);
                            String userName2 = platformMeta2.getUserName();
                            if (userName2 != null) {
                                InputView inputView3 = ((u) editProfileActivity.w()).f6254w.A;
                                inputView3.setVisibility(0);
                                inputView3.setDisplayValue(userName2);
                                inputView3.o();
                            }
                            String email2 = platformMeta2.getEmail();
                            if (email2 != null) {
                                InputView inputView4 = ((u) editProfileActivity.w()).f6254w.B;
                                inputView4.setVisibility(0);
                                inputView4.setDisplayValue(email2);
                                inputView4.o();
                            }
                            ChipView chipView2 = ((u) editProfileActivity.w()).f6254w.D;
                            String string2 = editProfileActivity.getString(R.string.text_verified);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            chipView2.setChipText(string2);
                            chipView2.setChipType(qj.j.f32018b);
                        }
                    } else {
                        EditProfileActivity.T(editProfileActivity);
                    }
                }
                return Unit.f23355a;
            case 3:
                AuthUiModel authUiModel = (AuthUiModel) obj;
                Intrinsics.c(authUiModel);
                editProfileActivity.R(authUiModel);
                return Unit.f23355a;
            case 4:
                Pair pair = (Pair) obj;
                editProfileActivity.C(new AnalyticEvent((String) pair.f23353a, (HashMap) pair.f23354b));
                return Unit.f23355a;
            case 5:
                String str = (String) ((kj.h) obj).f23224b;
                if (str != null) {
                    editProfileActivity.J(str);
                }
                return Unit.f23355a;
            case 6:
                a((Boolean) obj);
                return Unit.f23355a;
            case 7:
                a((Boolean) obj);
                return Unit.f23355a;
            case 8:
                a((Boolean) obj);
                return Unit.f23355a;
            case 9:
                d((String) obj);
                return Unit.f23355a;
            case 10:
                d((String) obj);
                return Unit.f23355a;
            case 11:
                d((String) obj);
                return Unit.f23355a;
            case 12:
                d((String) obj);
                return Unit.f23355a;
            case 13:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
