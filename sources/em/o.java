package em;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.b1;
import androidx.fragment.app.d1;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.ui.email.EmailActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o extends cm.b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public n f15740b;

    /* renamed from: c, reason: collision with root package name */
    public ProgressBar f15741c;

    /* renamed from: d, reason: collision with root package name */
    public String f15742d;

    @Override // cm.g
    public final void b() {
        this.f15741c.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f15741c.setVisibility(0);
    }

    @Override // androidx.fragment.app.g0
    public final void onAttach(Context context) {
        super.onAttach(context);
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof n) {
            this.f15740b = (n) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement ResendEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.button_resend_email) {
            n nVar = this.f15740b;
            String str = this.f15742d;
            EmailActivity emailActivity = (EmailActivity) nVar;
            ArrayList arrayList = emailActivity.getSupportFragmentManager().f1647d;
            if (arrayList != null && arrayList.size() > 0) {
                d1 supportFragmentManager = emailActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                supportFragmentManager.v(new b1(supportFragmentManager, null, -1, 0), false);
            }
            emailActivity.C(el.l.e0("emailLink", emailActivity.y().f742b), str);
        }
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_email_link_trouble_signing_in_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        this.f15741c = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f15742d = getArguments().getString("extra_email");
        view.findViewById(R.id.button_resend_email).setOnClickListener(this);
        al.d.Z0(requireContext(), this.f8228a.y(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }
}
