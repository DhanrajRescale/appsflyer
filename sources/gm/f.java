package gm;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.b1;
import androidx.fragment.app.d1;
import androidx.lifecycle.g1;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.ui.phone.PhoneNumberVerificationHandler;
import com.firebase.ui.auth.ui.phone.SpacedEditText;
import com.firebase.ui.auth.viewmodel.phone.PhoneProviderResponseHandler;
import java.util.concurrent.TimeUnit;
import ll.o;
import okhttp3.HttpUrl;
import r3.k;

/* loaded from: classes.dex */
public class f extends cm.b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f17510m = 0;

    /* renamed from: d, reason: collision with root package name */
    public PhoneNumberVerificationHandler f17513d;

    /* renamed from: e, reason: collision with root package name */
    public String f17514e;

    /* renamed from: f, reason: collision with root package name */
    public ProgressBar f17515f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f17516g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f17517h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f17518i;

    /* renamed from: j, reason: collision with root package name */
    public SpacedEditText f17519j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17521l;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f17511b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public final bl.d f17512c = new bl.d(this, 9);

    /* renamed from: k, reason: collision with root package name */
    public long f17520k = 60000;

    @Override // cm.g
    public final void b() {
        this.f17515f.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f17515f.setVisibility(0);
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((PhoneProviderResponseHandler) new g1(requireActivity()).a(PhoneProviderResponseHandler.class)).f10959e.observe(getViewLifecycleOwner(), new c1.a(this, 7));
    }

    @Override // cm.b, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17513d = (PhoneNumberVerificationHandler) new g1(requireActivity()).a(PhoneNumberVerificationHandler.class);
        this.f17514e = getArguments().getString("extra_phone_number");
        if (bundle != null) {
            this.f17520k = bundle.getLong("millis_until_finished");
        }
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_confirmation_code_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.g0
    public final void onDestroy() {
        super.onDestroy();
        this.f17511b.removeCallbacks(this.f17512c);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        CharSequence text;
        super.onResume();
        if (!this.f17521l) {
            this.f17521l = true;
            return;
        }
        ClipData primaryClip = ((ClipboardManager) k.getSystemService(requireContext(), ClipboardManager.class)).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() == 1 && (text = primaryClip.getItemAt(0).getText()) != null && text.length() == 6) {
            try {
                Integer.parseInt(text.toString());
                this.f17519j.setText(text);
            } catch (NumberFormatException unused) {
            }
        }
        Handler handler = this.f17511b;
        bl.d dVar = this.f17512c;
        handler.removeCallbacks(dVar);
        handler.postDelayed(dVar, 500L);
    }

    @Override // androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle bundle) {
        this.f17511b.removeCallbacks(this.f17512c);
        bundle.putLong("millis_until_finished", this.f17520k);
    }

    @Override // androidx.fragment.app.g0
    public final void onStart() {
        super.onStart();
        this.f17519j.requestFocus();
        ((InputMethodManager) requireActivity().getSystemService("input_method")).showSoftInput(this.f17519j, 0);
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        this.f17515f = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f17516g = (TextView) view.findViewById(R.id.edit_phone_number);
        this.f17518i = (TextView) view.findViewById(R.id.ticker);
        this.f17517h = (TextView) view.findViewById(R.id.resend_code);
        this.f17519j = (SpacedEditText) view.findViewById(R.id.confirmation_code);
        requireActivity().setTitle(getString(R.string.fui_verify_your_phone_title));
        p();
        this.f17519j.setText("------");
        SpacedEditText spacedEditText = this.f17519j;
        final int i10 = 1;
        spacedEditText.addTextChangedListener(new jm.a(spacedEditText, new o(this, 1)));
        this.f17516g.setText(this.f17514e);
        this.f17516g.setOnClickListener(new View.OnClickListener(this) { // from class: gm.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f17509b;

            {
                this.f17509b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                f fVar = this.f17509b;
                switch (i11) {
                    case 0:
                        fVar.f17513d.i(fVar.requireActivity(), fVar.f17514e, true);
                        fVar.f17517h.setVisibility(8);
                        fVar.f17518i.setVisibility(0);
                        fVar.f17518i.setText(String.format(fVar.getString(R.string.fui_resend_code_in), 60L));
                        fVar.f17520k = 60000L;
                        fVar.f17511b.postDelayed(fVar.f17512c, 500L);
                        return;
                    default:
                        int i12 = f.f17510m;
                        d1 supportFragmentManager = fVar.requireActivity().getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        supportFragmentManager.v(new b1(supportFragmentManager, null, -1, 0), false);
                        return;
                }
            }
        });
        final int i11 = 0;
        this.f17517h.setOnClickListener(new View.OnClickListener(this) { // from class: gm.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f17509b;

            {
                this.f17509b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                f fVar = this.f17509b;
                switch (i112) {
                    case 0:
                        fVar.f17513d.i(fVar.requireActivity(), fVar.f17514e, true);
                        fVar.f17517h.setVisibility(8);
                        fVar.f17518i.setVisibility(0);
                        fVar.f17518i.setText(String.format(fVar.getString(R.string.fui_resend_code_in), 60L));
                        fVar.f17520k = 60000L;
                        fVar.f17511b.postDelayed(fVar.f17512c, 500L);
                        return;
                    default:
                        int i12 = f.f17510m;
                        d1 supportFragmentManager = fVar.requireActivity().getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        supportFragmentManager.v(new b1(supportFragmentManager, null, -1, 0), false);
                        return;
                }
            }
        });
        al.d.Z0(requireContext(), this.f8228a.y(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }

    public final void p() {
        long j10 = this.f17520k - 500;
        this.f17520k = j10;
        if (j10 <= 0) {
            this.f17518i.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f17518i.setVisibility(8);
            this.f17517h.setVisibility(0);
        } else {
            this.f17518i.setText(String.format(getString(R.string.fui_resend_code_in), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f17520k) + 1)));
            this.f17511b.postDelayed(this.f17512c, 500L);
        }
    }
}
