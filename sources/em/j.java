package em;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.g1;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class j extends cm.b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Button f15718b;

    /* renamed from: c, reason: collision with root package name */
    public ProgressBar f15719c;

    /* renamed from: d, reason: collision with root package name */
    public EditText f15720d;

    /* renamed from: e, reason: collision with root package name */
    public TextInputLayout f15721e;

    /* renamed from: f, reason: collision with root package name */
    public km.a f15722f;

    /* renamed from: g, reason: collision with root package name */
    public EmailLinkSignInHandler f15723g;

    /* renamed from: h, reason: collision with root package name */
    public i f15724h;

    @Override // cm.g
    public final void b() {
        this.f15718b.setEnabled(true);
        this.f15719c.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f15718b.setEnabled(false);
        this.f15719c.setVisibility(0);
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof i) {
            this.f15724h = (i) activity;
            EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) new g1(this).a(EmailLinkSignInHandler.class);
            this.f15723g = emailLinkSignInHandler;
            emailLinkSignInHandler.f(this.f8228a.y());
            this.f15723g.f10959e.observe(getViewLifecycleOwner(), new zl.e(this, this, 4));
            return;
        }
        throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.button_next) {
            String obj = this.f15720d.getText().toString();
            if (this.f15722f.p(obj)) {
                EmailLinkSignInHandler emailLinkSignInHandler = this.f15723g;
                emailLinkSignInHandler.h(am.d.b());
                emailLinkSignInHandler.k(null, obj);
                return;
            }
            return;
        }
        if (id2 == R.id.email_layout || id2 == R.id.email) {
            this.f15721e.setError(null);
        }
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_check_email_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        this.f15718b = (Button) view.findViewById(R.id.button_next);
        this.f15719c = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f15718b.setOnClickListener(this);
        this.f15721e = (TextInputLayout) view.findViewById(R.id.email_layout);
        this.f15720d = (EditText) view.findViewById(R.id.email);
        this.f15722f = new km.a(this.f15721e, 0);
        this.f15721e.setOnClickListener(this);
        this.f15720d.setOnClickListener(this);
        getActivity().setTitle(R.string.fui_email_link_confirm_email_header);
        al.d.Z0(requireContext(), this.f8228a.y(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }
}
