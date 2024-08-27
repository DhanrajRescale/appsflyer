package em;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookSdk;
import com.firebase.ui.auth.ui.email.EmailLinkErrorRecoveryActivity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends cm.b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public e f15711b;

    /* renamed from: c, reason: collision with root package name */
    public ProgressBar f15712c;

    @Override // cm.g
    public final void b() {
        this.f15712c.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f15712c.setVisibility(0);
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof e) {
            this.f15711b = (e) activity;
            return;
        }
        throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.button_continue) {
            EmailLinkErrorRecoveryActivity emailLinkErrorRecoveryActivity = (EmailLinkErrorRecoveryActivity) this.f15711b;
            emailLinkErrorRecoveryActivity.getClass();
            emailLinkErrorRecoveryActivity.A(new j(), "CrossDeviceFragment", true, true);
        }
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_email_link_cross_device_linking, viewGroup, false);
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        this.f15712c = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        ((Button) view.findViewById(R.id.button_continue)).setOnClickListener(this);
        String str = this.f8228a.y().f748h;
        Preconditions.checkNotEmpty(str);
        HashMap z12 = dp.b.z1(Uri.parse(str));
        if (!z12.isEmpty()) {
            String str2 = (String) z12.get("ui_pid");
            str2.getClass();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1830313082:
                    if (str2.equals("twitter.com")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1536293812:
                    if (str2.equals("google.com")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -364826023:
                    if (str2.equals(FacebookSdk.FACEBOOK_COM)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 106642798:
                    if (str2.equals("phone")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1216985755:
                    if (str2.equals("password")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1985010934:
                    if (str2.equals("github.com")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 2120171958:
                    if (str2.equals("emailLink")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    string = zl.c.f42560f.getString(R.string.fui_idp_name_twitter);
                    break;
                case 1:
                    string = zl.c.f42560f.getString(R.string.fui_idp_name_google);
                    break;
                case 2:
                    string = zl.c.f42560f.getString(R.string.fui_idp_name_facebook);
                    break;
                case 3:
                    string = zl.c.f42560f.getString(R.string.fui_idp_name_phone);
                    break;
                case 4:
                case 6:
                    string = zl.c.f42560f.getString(R.string.fui_idp_name_email);
                    break;
                case 5:
                    string = zl.c.f42560f.getString(R.string.fui_idp_name_github);
                    break;
                default:
                    string = null;
                    break;
            }
            TextView textView = (TextView) view.findViewById(R.id.cross_device_linking_body);
            String string2 = getString(R.string.fui_email_link_cross_device_linking_text, string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            el.l.w(spannableStringBuilder, string2, string);
            textView.setText(spannableStringBuilder);
            if (Build.VERSION.SDK_INT >= 26) {
                textView.setJustificationMode(1);
            }
            al.d.Z0(requireContext(), this.f8228a.y(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
            return;
        }
        throw new IllegalArgumentException("Invalid link: no parameters found");
    }
}
