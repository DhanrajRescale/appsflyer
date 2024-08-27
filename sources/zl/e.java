package zl;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.d1;
import androidx.fragment.app.q1;
import androidx.fragment.app.v1;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.KickoffActivity;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity;
import com.firebase.ui.auth.ui.email.EmailLinkErrorRecoveryActivity;
import com.firebase.ui.auth.ui.email.RecoverPasswordActivity;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.ui.idp.SingleSignInActivity;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.firebase.ui.auth.viewmodel.email.WelcomeBackPasswordHandler;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseNetworkException;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import d4.b1;
import d4.n1;
import el.l;
import em.h;
import em.j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.g0;
import wo.m;

/* loaded from: classes.dex */
public final class e extends lm.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f42570f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(cm.c cVar, cm.c cVar2, int i10) {
        super(cVar2);
        this.f42569e = i10;
        this.f42570f = cVar;
    }

    @Override // lm.a
    public final void a(Exception exc) {
        String string;
        String string2;
        Object obj = this.f42570f;
        int i10 = this.f42569e;
        int i11 = R.string.fui_error_unknown;
        switch (i10) {
            case 0:
                if (exc instanceof UserCancellationException) {
                    ((KickoffActivity) obj).w(0, null);
                    return;
                } else if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    ((KickoffActivity) obj).w(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).f10891a));
                    return;
                } else {
                    ((KickoffActivity) obj).w(0, d.d(exc));
                    return;
                }
            case 1:
                if ((exc instanceof FirebaseUiException) && ((FirebaseUiException) exc).f10892a == 3) {
                    EmailActivity emailActivity = (EmailActivity) ((em.b) obj).f15704h;
                    emailActivity.getClass();
                    emailActivity.w(0, d.d(new FirebaseUiException(3, exc.getMessage())));
                }
                if (exc instanceof FirebaseNetworkException) {
                    em.b bVar = (em.b) obj;
                    m.g(bVar.getView(), bVar.getString(R.string.fui_no_internet), -1).h();
                    return;
                }
                return;
            case 2:
                if (exc instanceof UserCancellationException) {
                    ((EmailLinkCatcherActivity) obj).w(0, null);
                    return;
                }
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    ((EmailLinkCatcherActivity) obj).w(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).f10891a));
                    return;
                }
                if (exc instanceof FirebaseUiException) {
                    final int i12 = ((FirebaseUiException) exc).f10892a;
                    if (i12 != 8 && i12 != 7 && i12 != 11) {
                        if (i12 != 9 && i12 != 6) {
                            if (i12 == 10) {
                                EmailLinkCatcherActivity.A((EmailLinkCatcherActivity) obj, 116);
                                return;
                            }
                            return;
                        }
                        EmailLinkCatcherActivity.A((EmailLinkCatcherActivity) obj, 115);
                        return;
                    }
                    final EmailLinkCatcherActivity emailLinkCatcherActivity = (EmailLinkCatcherActivity) obj;
                    int i13 = EmailLinkCatcherActivity.f10912g;
                    emailLinkCatcherActivity.getClass();
                    AlertDialog.Builder builder = new AlertDialog.Builder(emailLinkCatcherActivity);
                    if (i12 == 11) {
                        string = emailLinkCatcherActivity.getString(R.string.fui_email_link_different_anonymous_user_header);
                        string2 = emailLinkCatcherActivity.getString(R.string.fui_email_link_different_anonymous_user_message);
                    } else if (i12 == 7) {
                        string = emailLinkCatcherActivity.getString(R.string.fui_email_link_invalid_link_header);
                        string2 = emailLinkCatcherActivity.getString(R.string.fui_email_link_invalid_link_message);
                    } else {
                        string = emailLinkCatcherActivity.getString(R.string.fui_email_link_wrong_device_header);
                        string2 = emailLinkCatcherActivity.getString(R.string.fui_email_link_wrong_device_message);
                    }
                    builder.setTitle(string).setMessage(string2).setPositiveButton(R.string.fui_email_link_dismiss_button, new DialogInterface.OnClickListener() { // from class: em.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            int i15 = EmailLinkCatcherActivity.f10912g;
                            EmailLinkCatcherActivity.this.w(i12, null);
                        }
                    }).create().show();
                    return;
                }
                if (exc instanceof FirebaseAuthInvalidCredentialsException) {
                    EmailLinkCatcherActivity.A((EmailLinkCatcherActivity) obj, 115);
                    return;
                } else {
                    ((EmailLinkCatcherActivity) obj).w(0, d.d(exc));
                    return;
                }
            case 3:
                EmailActivity emailActivity2 = (EmailActivity) ((h) obj).f15715g;
                emailActivity2.getClass();
                emailActivity2.w(0, d.d(new FirebaseUiException(3, exc.getMessage())));
                return;
            case 4:
                ((j) obj).f15721e.setError(exc.getMessage());
                return;
            case 5:
                if (!(exc instanceof FirebaseAuthInvalidUserException) && !(exc instanceof FirebaseAuthInvalidCredentialsException)) {
                    RecoverPasswordActivity recoverPasswordActivity = (RecoverPasswordActivity) obj;
                    recoverPasswordActivity.f10918f.setError(recoverPasswordActivity.getString(R.string.fui_error_unknown));
                    return;
                } else {
                    RecoverPasswordActivity recoverPasswordActivity2 = (RecoverPasswordActivity) obj;
                    recoverPasswordActivity2.f10918f.setError(recoverPasswordActivity2.getString(R.string.fui_error_email_does_not_exist));
                    return;
                }
            case 6:
                if (exc instanceof FirebaseAuthWeakPasswordException) {
                    em.m mVar = (em.m) obj;
                    mVar.f15734i.setError(mVar.getResources().getQuantityString(R.plurals.fui_error_weak_password, R.integer.fui_min_password_length));
                    return;
                }
                if (exc instanceof FirebaseAuthInvalidCredentialsException) {
                    em.m mVar2 = (em.m) obj;
                    mVar2.f15733h.setError(mVar2.getString(R.string.fui_invalid_email_address));
                    return;
                } else {
                    if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                        d dVar = ((FirebaseAuthAnonymousUpgradeException) exc).f10891a;
                        EmailActivity emailActivity3 = (EmailActivity) ((em.m) obj).f15738m;
                        emailActivity3.getClass();
                        emailActivity3.w(5, dVar.h());
                        return;
                    }
                    em.m mVar3 = (em.m) obj;
                    mVar3.f15733h.setError(mVar3.getString(R.string.fui_email_account_creation_error));
                    return;
                }
            case 7:
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    ((WelcomeBackPasswordPrompt) obj).w(5, ((FirebaseAuthAnonymousUpgradeException) exc).f10891a.h());
                    return;
                }
                if (exc instanceof FirebaseAuthException) {
                    try {
                        if (da.e.F(((FirebaseAuthException) exc).f11651a) == 11) {
                            ((WelcomeBackPasswordPrompt) obj).w(0, d.a(new FirebaseUiException(12)).h());
                            return;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = (WelcomeBackPasswordPrompt) obj;
                TextInputLayout textInputLayout = welcomeBackPasswordPrompt.f10930g;
                if (exc instanceof FirebaseAuthInvalidCredentialsException) {
                    i11 = R.string.fui_error_invalid_password;
                }
                textInputLayout.setError(welcomeBackPasswordPrompt.getString(i11));
                return;
            case 8:
                if (!(exc instanceof UserCancellationException)) {
                    if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                        ((AuthMethodPickerActivity) obj).w(5, ((FirebaseAuthAnonymousUpgradeException) exc).f10891a.h());
                        return;
                    } else if (exc instanceof FirebaseUiException) {
                        ((AuthMethodPickerActivity) obj).w(0, d.a((FirebaseUiException) exc).h());
                        return;
                    } else {
                        AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) obj;
                        Toast.makeText(authMethodPickerActivity, authMethodPickerActivity.getString(R.string.fui_error_unknown), 0).show();
                        return;
                    }
                }
                return;
            case 9:
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    ((SingleSignInActivity) obj).w(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).f10891a));
                    return;
                } else {
                    ((SingleSignInActivity) obj).w(0, d.d(exc));
                    return;
                }
            case 10:
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    ((WelcomeBackIdpPrompt) obj).w(5, ((FirebaseAuthAnonymousUpgradeException) exc).f10891a.h());
                    return;
                } else {
                    ((WelcomeBackIdpPrompt) obj).w(0, d.d(exc));
                    return;
                }
            default:
                return;
        }
    }

    @Override // lm.a
    public final void b(Object obj) {
        Object obj2 = this.f42570f;
        switch (this.f42569e) {
            case 0:
                e((d) obj);
                return;
            case 1:
                am.e eVar = (am.e) obj;
                String str = eVar.f765b;
                em.b bVar = (em.b) obj2;
                bVar.f15701e.setText(str);
                String str2 = eVar.f764a;
                if (str2 == null) {
                    em.a aVar = bVar.f15704h;
                    am.e eVar2 = new am.e("password", str, null, eVar.f767d, eVar.f768e);
                    EmailActivity emailActivity = (EmailActivity) aVar;
                    TextInputLayout textInputLayout = (TextInputLayout) emailActivity.findViewById(R.id.email_layout);
                    b d02 = l.d0("password", emailActivity.y().f742b);
                    if (d02 == null) {
                        d02 = l.d0("emailLink", emailActivity.y().f742b);
                    }
                    if (d02.a().getBoolean("extra_allow_new_emails", true)) {
                        d1 supportFragmentManager = emailActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                        if (d02.f42555a.equals("emailLink")) {
                            emailActivity.C(d02, str);
                            return;
                        }
                        em.m mVar = new em.m();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("extra_user", eVar2);
                        mVar.setArguments(bundle);
                        aVar2.f(R.id.fragment_register_email, mVar, "RegisterEmailFragment");
                        if (textInputLayout != null) {
                            String string = emailActivity.getString(R.string.fui_email_field_name);
                            WeakHashMap weakHashMap = n1.f13788a;
                            b1.v(textInputLayout, string);
                            v1 v1Var = q1.f1817a;
                            String k10 = b1.k(textInputLayout);
                            if (k10 != null) {
                                if (aVar2.f1811n == null) {
                                    aVar2.f1811n = new ArrayList();
                                    aVar2.f1812o = new ArrayList();
                                } else if (!aVar2.f1812o.contains(string)) {
                                    if (aVar2.f1811n.contains(k10)) {
                                        throw new IllegalArgumentException(nn.d.k("A shared element with the source name '", k10, "' has already been added to the transaction."));
                                    }
                                } else {
                                    throw new IllegalArgumentException(nn.d.k("A shared element with the target name '", string, "' has already been added to the transaction."));
                                }
                                aVar2.f1811n.add(k10);
                                aVar2.f1812o.add(string);
                            } else {
                                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                            }
                        }
                        aVar2.d();
                        aVar2.h(false);
                        return;
                    }
                    textInputLayout.setError(emailActivity.getString(R.string.fui_error_email_does_not_exist));
                    return;
                }
                if (!str2.equals("password") && !str2.equals("emailLink")) {
                    EmailActivity emailActivity2 = (EmailActivity) bVar.f15704h;
                    emailActivity2.startActivityForResult(WelcomeBackIdpPrompt.B(emailActivity2, emailActivity2.y(), eVar, null), 103);
                    emailActivity2.B();
                    return;
                }
                EmailActivity emailActivity3 = (EmailActivity) bVar.f15704h;
                emailActivity3.getClass();
                if (str2.equals("emailLink")) {
                    emailActivity3.C(l.e0("emailLink", emailActivity3.y().f742b), eVar.f765b);
                    return;
                }
                am.b y10 = emailActivity3.y();
                d a10 = new g0(eVar).a();
                int i10 = WelcomeBackPasswordPrompt.f10925i;
                emailActivity3.startActivityForResult(cm.c.v(emailActivity3, WelcomeBackPasswordPrompt.class, y10).putExtra("extra_idp_response", a10), 104);
                emailActivity3.B();
                return;
            case 2:
                e((d) obj);
                return;
            case 3:
                c((String) obj);
                return;
            case 4:
                e((d) obj);
                return;
            case 5:
                c((String) obj);
                return;
            case 6:
                e((d) obj);
                return;
            case 7:
                e((d) obj);
                return;
            case 8:
                e((d) obj);
                return;
            case 9:
                e((d) obj);
                return;
            case 10:
                e((d) obj);
                return;
            default:
                int i11 = gm.a.f17488m;
                ((gm.a) obj2).q((am.c) obj);
                return;
        }
    }

    public final void c(String str) {
        Object obj = this.f42570f;
        switch (this.f42569e) {
            case 3:
                Log.w("EmailLinkFragment", "Email for email link sign in sent successfully.");
                h hVar = (h) obj;
                bl.d dVar = new bl.d(this, 8);
                int i10 = h.f15713j;
                hVar.getClass();
                hVar.f8236c.postDelayed(dVar, Math.max(750 - (System.currentTimeMillis() - hVar.f8238e), 0L));
                hVar.f15717i = true;
                return;
            default:
                final RecoverPasswordActivity recoverPasswordActivity = (RecoverPasswordActivity) obj;
                recoverPasswordActivity.f10918f.setError(null);
                go.b bVar = new go.b(recoverPasswordActivity);
                h.e eVar = bVar.f17693a;
                eVar.f17609d = eVar.f17606a.getText(R.string.fui_title_confirm_recover_password);
                eVar.f17611f = recoverPasswordActivity.getString(R.string.fui_confirm_recovery_body, str);
                eVar.f17617l = new DialogInterface.OnDismissListener() { // from class: em.k
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        int i11 = RecoverPasswordActivity.f10914i;
                        RecoverPasswordActivity recoverPasswordActivity2 = RecoverPasswordActivity.this;
                        recoverPasswordActivity2.getClass();
                        recoverPasswordActivity2.w(-1, new Intent());
                    }
                };
                bVar.d().c();
                return;
        }
    }

    public final void e(d dVar) {
        Object obj = this.f42570f;
        switch (this.f42569e) {
            case 0:
                ((KickoffActivity) obj).w(-1, dVar.h());
                return;
            case 1:
            case 3:
            case 5:
            default:
                ((WelcomeBackIdpPrompt) obj).w(-1, dVar.h());
                return;
            case 2:
                ((EmailLinkCatcherActivity) obj).w(-1, dVar.h());
                return;
            case 4:
                EmailLinkErrorRecoveryActivity emailLinkErrorRecoveryActivity = (EmailLinkErrorRecoveryActivity) ((j) obj).f15724h;
                emailLinkErrorRecoveryActivity.getClass();
                emailLinkErrorRecoveryActivity.w(-1, dVar.h());
                return;
            case 6:
                em.m mVar = (em.m) obj;
                mVar.f8228a.z(mVar.f15727b.f10958g.f11632f, dVar, mVar.f15732g.getText().toString());
                return;
            case 7:
                WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = (WelcomeBackPasswordPrompt) obj;
                WelcomeBackPasswordHandler welcomeBackPasswordHandler = welcomeBackPasswordPrompt.f10927d;
                welcomeBackPasswordPrompt.z(welcomeBackPasswordHandler.f10958g.f11632f, dVar, welcomeBackPasswordHandler.f10962h);
                return;
            case 8:
                AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) obj;
                authMethodPickerActivity.z(authMethodPickerActivity.f10933c.f10958g.f11632f, dVar, null);
                return;
            case 9:
                SingleSignInActivity singleSignInActivity = (SingleSignInActivity) obj;
                singleSignInActivity.z(singleSignInActivity.f10939f.f10958g.f11632f, dVar, null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cm.a aVar, cm.c cVar, int i10, int i11) {
        super(cVar, null, cVar, i10);
        this.f42569e = i11;
        this.f42570f = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cm.b bVar, cm.b bVar2, int i10) {
        super(null, bVar2, bVar2, R.string.fui_progress_dialog_loading);
        this.f42569e = i10;
        this.f42570f = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cm.b bVar, cm.b bVar2, int i10, int i11) {
        super(null, bVar2, bVar2, i10);
        this.f42569e = i11;
        this.f42570f = bVar;
    }
}
