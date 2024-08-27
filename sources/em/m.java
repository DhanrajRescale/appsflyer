package em;

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
import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.viewmodel.email.EmailProviderResponseHandler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import ek.u;
import kotlin.jvm.internal.Intrinsics;
import m5.t;
import q0.g0;
import qu.i0;

/* loaded from: classes.dex */
public class m extends cm.b implements View.OnClickListener, View.OnFocusChangeListener, jm.b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f15726o = 0;

    /* renamed from: b, reason: collision with root package name */
    public EmailProviderResponseHandler f15727b;

    /* renamed from: c, reason: collision with root package name */
    public Button f15728c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f15729d;

    /* renamed from: e, reason: collision with root package name */
    public EditText f15730e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f15731f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f15732g;

    /* renamed from: h, reason: collision with root package name */
    public TextInputLayout f15733h;

    /* renamed from: i, reason: collision with root package name */
    public TextInputLayout f15734i;

    /* renamed from: j, reason: collision with root package name */
    public km.a f15735j;

    /* renamed from: k, reason: collision with root package name */
    public km.b f15736k;

    /* renamed from: l, reason: collision with root package name */
    public km.a f15737l;

    /* renamed from: m, reason: collision with root package name */
    public l f15738m;

    /* renamed from: n, reason: collision with root package name */
    public am.e f15739n;

    @Override // cm.g
    public final void b() {
        this.f15728c.setEnabled(true);
        this.f15729d.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f15728c.setEnabled(false);
        this.f15729d.setVisibility(0);
    }

    @Override // jm.b
    public final void h() {
        p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        j0 requireActivity = requireActivity();
        requireActivity.setTitle(R.string.fui_title_register_email);
        if (requireActivity instanceof l) {
            this.f15738m = (l) requireActivity;
            return;
        }
        throw new IllegalStateException("Activity must implement CheckEmailListener");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.button_create) {
            p();
        }
    }

    @Override // cm.b, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f15739n = (am.e) getArguments().getParcelable("extra_user");
        } else {
            this.f15739n = (am.e) bundle.getParcelable("extra_user");
        }
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
        Intrinsics.checkNotNullParameter(EmailProviderResponseHandler.class, "modelClass");
        iu.e b10 = a3.a.b(EmailProviderResponseHandler.class, "<this>", EmailProviderResponseHandler.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            EmailProviderResponseHandler emailProviderResponseHandler = (EmailProviderResponseHandler) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            this.f15727b = emailProviderResponseHandler;
            emailProviderResponseHandler.f(this.f8228a.y());
            this.f15727b.f10959e.observe(this, new zl.e(this, this, R.string.fui_progress_dialog_signing_up, 6));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_register_email_layout, viewGroup, false);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.email) {
            this.f15735j.p(this.f15730e.getText());
        } else if (id2 == R.id.name) {
            this.f15737l.p(this.f15731f.getText());
        } else if (id2 == R.id.password) {
            this.f15736k.p(this.f15732g.getText());
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("extra_user", new am.e("password", this.f15730e.getText().toString(), null, this.f15731f.getText().toString(), this.f15739n.f768e));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.d, km.b] */
    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        km.a aVar;
        this.f15728c = (Button) view.findViewById(R.id.button_create);
        this.f15729d = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f15730e = (EditText) view.findViewById(R.id.email);
        this.f15731f = (EditText) view.findViewById(R.id.name);
        this.f15732g = (EditText) view.findViewById(R.id.password);
        this.f15733h = (TextInputLayout) view.findViewById(R.id.email_layout);
        this.f15734i = (TextInputLayout) view.findViewById(R.id.password_layout);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.name_layout);
        boolean z10 = el.l.e0("password", this.f8228a.y().f742b).a().getBoolean("extra_require_name", true);
        TextInputLayout textInputLayout2 = this.f15734i;
        int integer = getResources().getInteger(R.integer.fui_min_password_length);
        ?? dVar = new l.d(textInputLayout2);
        dVar.f23264d = integer;
        dVar.f23560b = textInputLayout2.getResources().getQuantityString(R.plurals.fui_error_weak_password, integer, Integer.valueOf(integer));
        this.f15736k = dVar;
        if (z10) {
            aVar = new km.a(textInputLayout, getResources().getString(R.string.fui_missing_first_and_last_name));
        } else {
            aVar = new km.a(textInputLayout, 1);
        }
        this.f15737l = aVar;
        int i10 = 0;
        this.f15735j = new km.a(this.f15733h, 0);
        this.f15732g.setOnEditorActionListener(new jc.c(this, 4));
        this.f15730e.setOnFocusChangeListener(this);
        this.f15731f.setOnFocusChangeListener(this);
        this.f15732g.setOnFocusChangeListener(this);
        this.f15728c.setOnClickListener(this);
        if (!z10) {
            i10 = 8;
        }
        textInputLayout.setVisibility(i10);
        if (Build.VERSION.SDK_INT >= 26 && this.f8228a.y().f750j) {
            this.f15730e.setImportantForAutofill(2);
        }
        al.d.Z0(requireContext(), this.f8228a.y(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
        if (bundle != null) {
            return;
        }
        String str = this.f15739n.f765b;
        if (!TextUtils.isEmpty(str)) {
            this.f15730e.setText(str);
        }
        String str2 = this.f15739n.f767d;
        if (!TextUtils.isEmpty(str2)) {
            this.f15731f.setText(str2);
        }
        if (z10 && TextUtils.isEmpty(this.f15731f.getText())) {
            if (!TextUtils.isEmpty(this.f15730e.getText())) {
                EditText editText = this.f15731f;
                editText.post(new d4.j0(editText, 1));
                return;
            } else {
                EditText editText2 = this.f15730e;
                editText2.post(new d4.j0(editText2, 1));
                return;
            }
        }
        EditText editText3 = this.f15732g;
        editText3.post(new d4.j0(editText3, 1));
    }

    public final void p() {
        Task s02;
        String obj = this.f15730e.getText().toString();
        String obj2 = this.f15732g.getText().toString();
        String obj3 = this.f15731f.getText().toString();
        boolean p10 = this.f15735j.p(obj);
        boolean p11 = this.f15736k.p(obj2);
        boolean p12 = this.f15737l.p(obj3);
        if (p10 && p11 && p12) {
            EmailProviderResponseHandler emailProviderResponseHandler = this.f15727b;
            zl.d a10 = new g0(new am.e("password", obj, null, obj3, this.f15739n.f768e)).a();
            emailProviderResponseHandler.getClass();
            if (!a10.f()) {
                emailProviderResponseHandler.h(am.d.a(a10.f42568f));
                return;
            }
            if (a10.e().equals("password")) {
                emailProviderResponseHandler.h(am.d.b());
                im.a b10 = im.a.b();
                String c10 = a10.c();
                FirebaseAuth firebaseAuth = emailProviderResponseHandler.f10958g;
                am.b bVar = (am.b) emailProviderResponseHandler.f10961d;
                b10.getClass();
                if (im.a.a(firebaseAuth, bVar)) {
                    Preconditions.checkNotEmpty(c10);
                    Preconditions.checkNotEmpty(obj2);
                    s02 = firebaseAuth.f11632f.S(new zp.f(c10, obj2, null, null, false));
                } else {
                    firebaseAuth.getClass();
                    Preconditions.checkNotEmpty(c10);
                    Preconditions.checkNotEmpty(obj2);
                    s02 = new zp.g0(firebaseAuth, c10, obj2, 2).s0(firebaseAuth, firebaseAuth.f11637k, firebaseAuth.f11641o);
                }
                s02.continueWithTask(new u(a10, 5)).addOnFailureListener(new t("EmailProviderResponseHa", "Error creating user", 1)).addOnSuccessListener(new bm.c(4, emailProviderResponseHandler, a10)).addOnFailureListener(new androidx.fragment.app.h(emailProviderResponseHandler, b10, c10, obj2, 4));
                return;
            }
            throw new IllegalStateException("This handler can only be used with the email provider");
        }
    }
}
