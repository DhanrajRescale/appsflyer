package gm;

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
import com.firebase.ui.auth.ui.phone.CheckPhoneHandler;
import com.firebase.ui.auth.ui.phone.CountryListSpinner;
import com.firebase.ui.auth.ui.phone.PhoneNumberVerificationHandler;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.material.textfield.TextInputLayout;
import e5.o;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class a extends cm.b implements View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f17488m = 0;

    /* renamed from: b, reason: collision with root package name */
    public PhoneNumberVerificationHandler f17489b;

    /* renamed from: c, reason: collision with root package name */
    public CheckPhoneHandler f17490c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17491d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressBar f17492e;

    /* renamed from: f, reason: collision with root package name */
    public Button f17493f;

    /* renamed from: g, reason: collision with root package name */
    public CountryListSpinner f17494g;

    /* renamed from: h, reason: collision with root package name */
    public View f17495h;

    /* renamed from: i, reason: collision with root package name */
    public TextInputLayout f17496i;

    /* renamed from: j, reason: collision with root package name */
    public EditText f17497j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f17498k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f17499l;

    @Override // cm.g
    public final void b() {
        this.f17493f.setEnabled(true);
        this.f17492e.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f17493f.setEnabled(false);
        this.f17492e.setVisibility(0);
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onActivityCreated(bundle);
        this.f17490c.f10959e.observe(getViewLifecycleOwner(), new zl.e(this, this, 11));
        if (bundle == null && !this.f17491d) {
            this.f17491d = true;
            Bundle bundle2 = getArguments().getBundle("extra_params");
            if (bundle2 != null) {
                str = bundle2.getString("extra_phone_number");
                str3 = bundle2.getString("extra_country_iso");
                str2 = bundle2.getString("extra_national_number");
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (!TextUtils.isEmpty(str)) {
                q(im.c.e(str));
                return;
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
                int b10 = im.c.b(str3);
                if (b10 == null) {
                    b10 = 1;
                    str3 = im.c.f20117a;
                }
                q(new am.c(str2.replaceFirst("^\\+?", HttpUrl.FRAGMENT_ENCODE_SET), str3, String.valueOf(b10)));
                return;
            }
            if (!TextUtils.isEmpty(str3)) {
                String valueOf = String.valueOf(im.c.b(str3));
                CountryListSpinner countryListSpinner = this.f17494g;
                Locale locale = new Locale(HttpUrl.FRAGMENT_ENCODE_SET, str3);
                countryListSpinner.getClass();
                if (countryListSpinner.e(locale.getCountry()) && !TextUtils.isEmpty(locale.getDisplayName()) && !TextUtils.isEmpty(valueOf)) {
                    countryListSpinner.f(Integer.parseInt(valueOf), locale);
                    return;
                }
                return;
            }
            if (this.f8228a.y().f751k) {
                CheckPhoneHandler checkPhoneHandler = this.f17490c;
                checkPhoneHandler.getClass();
                checkPhoneHandler.h(am.d.a(new PendingIntentRequiredException(101, Credentials.getClient(checkPhoneHandler.e()).getHintPickerIntent(new HintRequest.Builder().setPhoneNumberIdentifierSupported(true).build()))));
            }
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String a10;
        CheckPhoneHandler checkPhoneHandler = this.f17490c;
        checkPhoneHandler.getClass();
        if (i10 == 101 && i11 == -1 && (a10 = im.c.a(((Credential) intent.getParcelableExtra(Credential.EXTRA_KEY)).getId(), im.c.d(checkPhoneHandler.e()))) != null) {
            checkPhoneHandler.h(am.d.c(im.c.e(a10)));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p();
    }

    @Override // cm.b, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17489b = (PhoneNumberVerificationHandler) new g1(requireActivity()).a(PhoneNumberVerificationHandler.class);
        this.f17490c = (CheckPhoneHandler) new g1(this).a(CheckPhoneHandler.class);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_phone_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        int i10;
        this.f17492e = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f17493f = (Button) view.findViewById(R.id.send_code);
        this.f17494g = (CountryListSpinner) view.findViewById(R.id.country_list);
        this.f17495h = view.findViewById(R.id.country_list_popup_anchor);
        this.f17496i = (TextInputLayout) view.findViewById(R.id.phone_layout);
        this.f17497j = (EditText) view.findViewById(R.id.phone_number);
        this.f17498k = (TextView) view.findViewById(R.id.send_sms_tos);
        this.f17499l = (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text);
        this.f17498k.setText(getString(R.string.fui_sms_terms_of_service, getString(R.string.fui_verify_phone_number)));
        if (Build.VERSION.SDK_INT >= 26 && this.f8228a.y().f751k) {
            this.f17497j.setImportantForAutofill(2);
        }
        requireActivity().setTitle(getString(R.string.fui_verify_phone_number_title));
        this.f17497j.setOnEditorActionListener(new jc.c(new dj.e(this, 8), 4));
        this.f17493f.setOnClickListener(this);
        am.b y10 = this.f8228a.y();
        boolean z11 = !TextUtils.isEmpty(y10.f746f);
        String str = y10.f747g;
        if (z11 && (!TextUtils.isEmpty(str))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!y10.a() && z10) {
            Context requireContext = requireContext();
            TextView textView = this.f17498k;
            boolean z12 = !TextUtils.isEmpty(y10.f746f);
            boolean isEmpty = true ^ TextUtils.isEmpty(str);
            if (z12 && isEmpty) {
                i10 = R.string.fui_sms_terms_of_service_and_privacy_policy_extended;
            } else {
                i10 = -1;
            }
            o.h(requireContext, y10, R.string.fui_verify_phone_number, i10, textView);
        } else {
            al.d.Z0(requireContext(), y10, this.f17499l);
            this.f17498k.setText(getString(R.string.fui_sms_terms_of_service, getString(R.string.fui_verify_phone_number)));
        }
        this.f17494g.d(this.f17495h, getArguments().getBundle("extra_params"));
        this.f17494g.setOnClickListener(new ph.a(this, 24));
    }

    public final void p() {
        String a10;
        String obj = this.f17497j.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            a10 = null;
        } else {
            a10 = im.c.a(obj, this.f17494g.getSelectedCountryInfo());
        }
        if (a10 == null) {
            this.f17496i.setError(getString(R.string.fui_invalid_phone_number));
        } else {
            this.f17489b.i(requireActivity(), a10, false);
        }
    }

    public final void q(am.c cVar) {
        if (cVar != null) {
            am.c cVar2 = am.c.f756d;
            if (!cVar2.equals(cVar)) {
                String str = cVar.f757a;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = cVar.f759c;
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = cVar.f758b;
                        if (!TextUtils.isEmpty(str3)) {
                            this.f17497j.setText(str);
                            this.f17497j.setSelection(str.length());
                            if (!cVar2.equals(cVar) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && this.f17494g.e(str3)) {
                                CountryListSpinner countryListSpinner = this.f17494g;
                                Locale locale = new Locale(HttpUrl.FRAGMENT_ENCODE_SET, str3);
                                countryListSpinner.getClass();
                                if (countryListSpinner.e(locale.getCountry()) && !TextUtils.isEmpty(locale.getDisplayName()) && !TextUtils.isEmpty(str2)) {
                                    countryListSpinner.f(Integer.parseInt(str2), locale);
                                }
                                p();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        this.f17496i.setError(getString(R.string.fui_invalid_phone_number));
    }
}
