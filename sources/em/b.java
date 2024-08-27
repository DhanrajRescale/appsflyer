package em;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.g1;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.ui.auth.ui.email.CheckEmailHandler;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.material.textfield.TextInputLayout;
import i5.w;

/* loaded from: classes.dex */
public class b extends cm.b implements View.OnClickListener, jm.b {

    /* renamed from: b, reason: collision with root package name */
    public CheckEmailHandler f15698b;

    /* renamed from: c, reason: collision with root package name */
    public Button f15699c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f15700d;

    /* renamed from: e, reason: collision with root package name */
    public EditText f15701e;

    /* renamed from: f, reason: collision with root package name */
    public TextInputLayout f15702f;

    /* renamed from: g, reason: collision with root package name */
    public km.a f15703g;

    /* renamed from: h, reason: collision with root package name */
    public a f15704h;

    @Override // cm.g
    public final void b() {
        this.f15699c.setEnabled(true);
        this.f15700d.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f15699c.setEnabled(false);
        this.f15700d.setVisibility(0);
    }

    @Override // jm.b
    public final void h() {
        p();
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CheckEmailHandler checkEmailHandler = (CheckEmailHandler) new g1(this).a(CheckEmailHandler.class);
        this.f15698b = checkEmailHandler;
        checkEmailHandler.f(this.f8228a.y());
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof a) {
            this.f15704h = (a) activity;
            this.f15698b.f10959e.observe(getViewLifecycleOwner(), new zl.e(this, this, R.string.fui_progress_dialog_checking_accounts, 1));
            if (bundle != null) {
                return;
            }
            String string = getArguments().getString("extra_email");
            if (!TextUtils.isEmpty(string)) {
                this.f15701e.setText(string);
                p();
                return;
            } else {
                if (this.f8228a.y().f751k) {
                    CheckEmailHandler checkEmailHandler2 = this.f15698b;
                    checkEmailHandler2.getClass();
                    checkEmailHandler2.h(am.d.a(new PendingIntentRequiredException(101, Credentials.getClient(checkEmailHandler2.e()).getHintPickerIntent(new HintRequest.Builder().setEmailAddressIdentifierSupported(true).build()))));
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Activity must implement CheckEmailListener");
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        CheckEmailHandler checkEmailHandler = this.f15698b;
        checkEmailHandler.getClass();
        if (i10 == 101 && i11 == -1) {
            checkEmailHandler.h(am.d.b());
            Credential credential = (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY);
            String id2 = credential.getId();
            el.l.S(checkEmailHandler.f10958g, (am.b) checkEmailHandler.f10961d, id2).continueWithTask(new w(5)).addOnCompleteListener(new c(checkEmailHandler, id2, credential, 0));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.button_next) {
            p();
        } else if (id2 == R.id.email_layout || id2 == R.id.email) {
            this.f15702f.setError(null);
        }
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_check_email_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        int i10;
        this.f15699c = (Button) view.findViewById(R.id.button_next);
        this.f15700d = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f15702f = (TextInputLayout) view.findViewById(R.id.email_layout);
        this.f15701e = (EditText) view.findViewById(R.id.email);
        this.f15703g = new km.a(this.f15702f, 0);
        this.f15702f.setOnClickListener(this);
        this.f15701e.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(R.id.header_text);
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f15701e.setOnEditorActionListener(new jc.c(this, 4));
        if (Build.VERSION.SDK_INT >= 26 && this.f8228a.y().f751k) {
            this.f15701e.setImportantForAutofill(2);
        }
        this.f15699c.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R.id.email_tos_and_pp_text);
        TextView textView3 = (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text);
        am.b y10 = this.f8228a.y();
        if (!y10.a()) {
            Context requireContext = requireContext();
            boolean z10 = !TextUtils.isEmpty(y10.f746f);
            boolean z11 = !TextUtils.isEmpty(y10.f747g);
            if (z10 && z11) {
                i10 = R.string.fui_tos_and_pp;
            } else {
                i10 = -1;
            }
            e5.o.h(requireContext, y10, -1, i10, textView2);
            return;
        }
        textView2.setVisibility(8);
        al.d.Z0(requireContext(), y10, textView3);
    }

    public final void p() {
        String obj = this.f15701e.getText().toString();
        if (this.f15703g.p(obj)) {
            CheckEmailHandler checkEmailHandler = this.f15698b;
            checkEmailHandler.h(am.d.b());
            el.l.S(checkEmailHandler.f10958g, (am.b) checkEmailHandler.f10961d, obj).continueWithTask(new w(5)).addOnCompleteListener(new androidx.fragment.app.g(2, checkEmailHandler, obj));
        }
    }
}
