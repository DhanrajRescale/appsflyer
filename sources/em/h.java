package em;

import am.d;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import aq.g0;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSendEmailHandler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import ek.h0;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

/* loaded from: classes.dex */
public class h extends cm.f {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15713j = 0;

    /* renamed from: f, reason: collision with root package name */
    public EmailLinkSendEmailHandler f15714f;

    /* renamed from: g, reason: collision with root package name */
    public g f15715g;

    /* renamed from: h, reason: collision with root package name */
    public ScrollView f15716h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15717i;

    public static h p(String str, zp.b bVar, zl.d dVar, boolean z10) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putString("extra_email", str);
        bundle.putParcelable("action_code_settings", bVar);
        bundle.putParcelable("extra_idp_response", dVar);
        bundle.putBoolean("force_same_device", z10);
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        final String str;
        String str2;
        super.onActivityCreated(bundle);
        Intrinsics.checkNotNullParameter(this, "owner");
        h1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        d1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        y4.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(EmailLinkSendEmailHandler.class, "modelClass");
        iu.e b10 = a3.a.b(EmailLinkSendEmailHandler.class, "<this>", EmailLinkSendEmailHandler.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            EmailLinkSendEmailHandler emailLinkSendEmailHandler = (EmailLinkSendEmailHandler) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            this.f15714f = emailLinkSendEmailHandler;
            emailLinkSendEmailHandler.f(this.f8228a.y());
            this.f15714f.f10959e.observe(getViewLifecycleOwner(), new zl.e(this, this, R.string.fui_progress_dialog_sending, 3));
            final String string = getArguments().getString("extra_email");
            zp.b bVar = (zp.b) getArguments().getParcelable("action_code_settings");
            zl.d dVar = (zl.d) getArguments().getParcelable("extra_idp_response");
            boolean z10 = getArguments().getBoolean("force_same_device");
            if (!this.f15717i) {
                final EmailLinkSendEmailHandler emailLinkSendEmailHandler2 = this.f15714f;
                if (emailLinkSendEmailHandler2.f10958g != null) {
                    emailLinkSendEmailHandler2.h(am.d.b());
                    im.a b11 = im.a.b();
                    FirebaseAuth firebaseAuth = emailLinkSendEmailHandler2.f10958g;
                    am.b bVar2 = (am.b) emailLinkSendEmailHandler2.f10961d;
                    b11.getClass();
                    if (im.a.a(firebaseAuth, bVar2)) {
                        str = ((g0) emailLinkSendEmailHandler2.f10958g.f11632f).f2717b.f2702a;
                    } else {
                        str = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Random random = new Random();
                    for (int i10 = 0; i10 < 10; i10++) {
                        sb2.append("1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(10)));
                    }
                    final String sb3 = sb2.toString();
                    h0 h0Var = new h0(bVar.f42712a);
                    h0Var.a("ui_sid", sb3);
                    h0Var.a("ui_auid", str);
                    if (z10) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    h0Var.a("ui_sd", str2);
                    if (dVar != null) {
                        h0Var.a("ui_pid", dVar.e());
                    }
                    zp.a aVar = new zp.a();
                    StringBuilder sb4 = (StringBuilder) h0Var.f15593b;
                    int i11 = 1;
                    if (sb4.charAt(sb4.length() - 1) == '?') {
                        StringBuilder sb5 = (StringBuilder) h0Var.f15593b;
                        sb5.setLength(sb5.length() - 1);
                    }
                    String sb6 = ((StringBuilder) h0Var.f15593b).toString();
                    aVar.f42701a = sb6;
                    aVar.f42706f = true;
                    aVar.f42703c = bVar.f42715d;
                    aVar.f42704d = bVar.f42716e;
                    aVar.f42705e = bVar.f42717f;
                    aVar.f42702b = bVar.f42713b;
                    if (sb6 != null) {
                        zp.b bVar3 = new zp.b(aVar);
                        FirebaseAuth firebaseAuth2 = emailLinkSendEmailHandler2.f10958g;
                        firebaseAuth2.getClass();
                        Preconditions.checkNotEmpty(string);
                        Preconditions.checkNotNull(bVar3);
                        if (bVar3.f42718g) {
                            String str3 = firebaseAuth2.f11635i;
                            if (str3 != null) {
                                bVar3.f42719h = str3;
                            }
                            new zp.g0(firebaseAuth2, string, bVar3, i11).s0(firebaseAuth2, firebaseAuth2.f11637k, firebaseAuth2.f11639m).addOnCompleteListener(new OnCompleteListener() { // from class: mm.a
                                @Override // com.google.android.gms.tasks.OnCompleteListener
                                public final void onComplete(Task task) {
                                    EmailLinkSendEmailHandler emailLinkSendEmailHandler3 = EmailLinkSendEmailHandler.this;
                                    emailLinkSendEmailHandler3.getClass();
                                    if (task.isSuccessful()) {
                                        im.b bVar4 = im.b.f20115c;
                                        Application e10 = emailLinkSendEmailHandler3.e();
                                        bVar4.getClass();
                                        Preconditions.checkNotNull(e10);
                                        String str4 = string;
                                        Preconditions.checkNotNull(str4);
                                        SharedPreferences.Editor edit = e10.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
                                        edit.putString("com.firebase.ui.auth.data.client.email", str4);
                                        edit.putString("com.firebase.ui.auth.data.client.auid", str);
                                        edit.putString("com.firebase.ui.auth.data.client.sid", sb3);
                                        edit.apply();
                                        emailLinkSendEmailHandler3.h(d.c(str4));
                                        return;
                                    }
                                    emailLinkSendEmailHandler3.h(d.a(task.getException()));
                                }
                            });
                            return;
                        }
                        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                    }
                    throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // androidx.fragment.app.g0
    public final void onAttach(Context context) {
        super.onAttach(context);
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof g) {
            this.f15715g = (g) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement TroubleSigningInListener");
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_email_link_sign_in_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("emailSent", this.f15717i);
    }

    @Override // cm.f, androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f15717i = bundle.getBoolean("emailSent");
        }
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.top_level_view);
        this.f15716h = scrollView;
        if (!this.f15717i) {
            scrollView.setVisibility(8);
        }
        String string = getArguments().getString("extra_email");
        TextView textView = (TextView) view.findViewById(R.id.sign_in_email_sent_text);
        String string2 = getString(R.string.fui_email_link_email_sent, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        el.l.w(spannableStringBuilder, string2, string);
        textView.setText(spannableStringBuilder);
        view.findViewById(R.id.trouble_signing_in).setOnClickListener(new bb.a(29, this, string));
        al.d.Z0(requireContext(), this.f8228a.y(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }
}
