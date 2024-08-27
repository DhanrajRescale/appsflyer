package da;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.recyclerview.widget.RecyclerView;
import b0.s;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import d7.i0;
import g1.o;
import h0.h;
import iu.b0;
import iu.n;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import lv.m;
import okhttp3.internal.ws.RealWebSocket;
import t0.r;
import t0.x1;
import xf.v;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String B(int i10) {
        if (i10 == 1) {
            return "FIXED";
        }
        if (i10 == 2) {
            return "WRAP_CONTENT";
        }
        if (i10 == 3) {
            return "MATCH_CONSTRAINT";
        }
        if (i10 == 4) {
            return "MATCH_PARENT";
        }
        throw null;
    }

    public static /* synthetic */ String C(int i10) {
        switch (i10) {
            case 1:
                return "HTTP_METHOD_UNKNOWN";
            case 2:
                return "GET";
            case 3:
                return "PUT";
            case 4:
                return "POST";
            case 5:
                return "DELETE";
            case 6:
                return "HEAD";
            case 7:
                return "PATCH";
            case 8:
                return "OPTIONS";
            case 9:
                return "TRACE";
            case 10:
                return "CONNECT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String D(int i10) {
        switch (i10) {
            case 1:
                return "CONTINUOUS";
            case 2:
                return "TEXT";
            case 3:
                return "BINARY";
            case 4:
                return "PING";
            case 5:
                return "PONG";
            case 6:
                return "CLOSING";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "MATCH_PARENT" : "MATCH_CONSTRAINT" : "WRAP_CONTENT" : "FIXED";
    }

    public static /* synthetic */ int F(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("ERROR_INVALID_CUSTOM_TOKEN")) {
            return 1;
        }
        if (str.equals("ERROR_CUSTOM_TOKEN_MISMATCH")) {
            return 2;
        }
        if (str.equals("ERROR_INVALID_CREDENTIAL")) {
            return 3;
        }
        if (str.equals("ERROR_INVALID_EMAIL")) {
            return 4;
        }
        if (str.equals("ERROR_WRONG_PASSWORD")) {
            return 5;
        }
        if (str.equals("ERROR_USER_MISMATCH")) {
            return 6;
        }
        if (str.equals("ERROR_REQUIRES_RECENT_LOGIN")) {
            return 7;
        }
        if (str.equals("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL")) {
            return 8;
        }
        if (str.equals("ERROR_EMAIL_ALREADY_IN_USE")) {
            return 9;
        }
        if (str.equals("ERROR_CREDENTIAL_ALREADY_IN_USE")) {
            return 10;
        }
        if (str.equals("ERROR_USER_DISABLED")) {
            return 11;
        }
        if (str.equals("ERROR_USER_TOKEN_EXPIRED")) {
            return 12;
        }
        if (str.equals("ERROR_USER_NOT_FOUND")) {
            return 13;
        }
        if (str.equals("ERROR_INVALID_USER_TOKEN")) {
            return 14;
        }
        if (str.equals("ERROR_OPERATION_NOT_ALLOWED")) {
            return 15;
        }
        if (str.equals("ERROR_TOO_MANY_REQUESTS")) {
            return 16;
        }
        if (str.equals("ERROR_WEAK_PASSWORD")) {
            return 17;
        }
        if (str.equals("ERROR_EXPIRED_ACTION_CODE")) {
            return 18;
        }
        if (str.equals("ERROR_INVALID_ACTION_CODE")) {
            return 19;
        }
        if (str.equals("ERROR_INVALID_MESSAGE_PAYLOAD")) {
            return 20;
        }
        if (str.equals("ERROR_INVALID_RECIPIENT_EMAIL")) {
            return 21;
        }
        if (str.equals("ERROR_INVALID_SENDER")) {
            return 22;
        }
        if (str.equals("ERROR_MISSING_EMAIL")) {
            return 23;
        }
        if (str.equals("ERROR_MISSING_PASSWORD")) {
            return 24;
        }
        if (str.equals("ERROR_MISSING_PHONE_NUMBER")) {
            return 25;
        }
        if (str.equals("ERROR_INVALID_PHONE_NUMBER")) {
            return 26;
        }
        if (str.equals("ERROR_MISSING_VERIFICATION_CODE")) {
            return 27;
        }
        if (str.equals("ERROR_INVALID_VERIFICATION_CODE")) {
            return 28;
        }
        if (str.equals("ERROR_MISSING_VERIFICATION_ID")) {
            return 29;
        }
        if (str.equals("ERROR_INVALID_VERIFICATION_ID")) {
            return 30;
        }
        if (str.equals("ERROR_RETRY_PHONE_AUTH")) {
            return 31;
        }
        if (str.equals("ERROR_SESSION_EXPIRED")) {
            return 32;
        }
        if (str.equals("ERROR_QUOTA_EXCEEDED")) {
            return 33;
        }
        if (str.equals("ERROR_APP_NOT_AUTHORIZED")) {
            return 34;
        }
        if (str.equals("ERROR_API_NOT_AVAILABLE")) {
            return 35;
        }
        if (str.equals("ERROR_WEB_CONTEXT_CANCELED")) {
            return 36;
        }
        if (str.equals("ERROR_UNKNOWN")) {
            return 37;
        }
        throw new IllegalArgumentException("No enum constant com.firebase.ui.auth.util.FirebaseAuthError.".concat(str));
    }

    public static /* synthetic */ int G(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("EMBEDDING_DISABLED")) {
            return 1;
        }
        if (str.equals("BLOCKED_FOR_APP")) {
            return 2;
        }
        if (str.equals("NOT_PLAYABLE")) {
            return 3;
        }
        if (str.equals("NETWORK_ERROR")) {
            return 4;
        }
        if (str.equals("UNAUTHORIZED_OVERLAY")) {
            return 5;
        }
        if (str.equals("PLAYER_VIEW_TOO_SMALL")) {
            return 6;
        }
        if (str.equals("PLAYER_VIEW_NOT_VISIBLE")) {
            return 7;
        }
        if (str.equals("EMPTY_PLAYLIST")) {
            return 8;
        }
        if (str.equals("AUTOPLAY_DISABLED")) {
            return 9;
        }
        if (str.equals("USER_DECLINED_RESTRICTED_CONTENT")) {
            return 10;
        }
        if (str.equals("USER_DECLINED_HIGH_BANDWIDTH")) {
            return 11;
        }
        if (str.equals("UNEXPECTED_SERVICE_DISCONNECTION")) {
            return 12;
        }
        if (str.equals("INTERNAL_ERROR")) {
            return 13;
        }
        if (str.equals("UNKNOWN")) {
            return 14;
        }
        throw new IllegalArgumentException("No enum constant com.google.android.youtube.player.YouTubePlayer.ErrorReason.".concat(str));
    }

    public static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 1:
                return "The custom token format is incorrect. Please check the documentation.";
            case 2:
                return "Invalid configuration. Ensure your app's SHA1 is correct in the Firebase console.";
            case 3:
                return "The supplied auth credential is malformed or has expired.";
            case 4:
                return "The email address is badly formatted.";
            case 5:
                return "The password is invalid or the user does not have a password.";
            case 6:
                return "The supplied credentials do not correspond to the previously signed in user.";
            case 7:
                return "This operation is sensitive and requires recent authentication. Log in again before retrying this request.";
            case 8:
                return "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address.";
            case 9:
                return "The email address is already in use by another account.";
            case 10:
                return "This credential is already associated with a different user account.";
            case 11:
                return "The user account has been disabled by an administrator.";
            case 12:
                return "The user's credential has expired. The user must sign in again.";
            case 13:
                return "There is no user record corresponding to this identifier. The user may have been deleted.";
            case 14:
                return "The user's credential is no longer valid. The user must sign in again.";
            case 15:
                return "This operation is not allowed. Enable the sign-in method in the Authentication tab of the Firebase console";
            case 16:
                return "We have blocked all requests from this device due to unusual activity. Try again later.";
            case 17:
                return "The given password is too weak, please choose a stronger password.";
            case 18:
                return "The out of band code has expired.";
            case 19:
                return "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used.";
            case 20:
                return "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console.";
            case 21:
                return "The email corresponding to this action failed to send as the provided recipient email address is invalid.";
            case 22:
                return "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console.";
            case 23:
                return "An email address must be provided.";
            case 24:
                return "A password must be provided.";
            case 25:
                return "To send verification codes, provide a phone number for the recipient.";
            case 26:
                return "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code].";
            case 27:
                return "The phone auth credential was created with an empty sms verification code";
            case 28:
                return "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user.";
            case 29:
                return "The phone auth credential was created with an empty verification ID";
            case 30:
                return "The verification ID used to create the phone auth credential is invalid.";
            case 31:
                return "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication.";
            case 32:
                return "The sms code has expired. Please re-send the verification code to try again.";
            case 33:
                return "The sms quota for this project has been exceeded.";
            case 34:
                return "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console.";
            case 35:
                return "The API that you are calling is not available on devices without Google Play Services.";
            case 36:
                return "The web operation was canceled by the user";
            case 37:
                return "An unknown error occurred.";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String b(int i10) {
        switch (i10) {
            case 1:
                return "_fstec";
            case 2:
                return "_fsntc";
            case 3:
                return "_tsns";
            case 4:
                return "_fr_tot";
            case 5:
                return "_fr_slo";
            case 6:
                return "_fr_fzn";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i10) {
        switch (i10) {
            case 1:
                return "_as";
            case 2:
                return "_astui";
            case 3:
                return "_astfd";
            case 4:
                return "_asti";
            case 5:
                return "_fs";
            case 6:
                return "_bs";
            default:
                throw null;
        }
    }

    public static /* synthetic */ long d(int i10) {
        if (i10 == 1) {
            return 0L;
        }
        if (i10 == 2) {
            return 1L;
        }
        if (i10 == 3) {
            return 2L;
        }
        if (i10 == 4) {
            return 3L;
        }
        if (i10 == 5) {
            return 4L;
        }
        throw null;
    }

    public static /* synthetic */ long e(int i10) {
        if (i10 == 1) {
            return 1099511627776L;
        }
        if (i10 == 2) {
            return 1073741824L;
        }
        if (i10 == 3) {
            return 1048576L;
        }
        if (i10 == 4) {
            return RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        if (i10 == 5) {
            return 1L;
        }
        throw null;
    }

    public static int f(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static LayoutInflater g(RecyclerView recyclerView, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(recyclerView, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return LayoutInflater.from(recyclerView.getContext());
    }

    public static h1 h(j0 j0Var, String str, ca.c cVar, String str2) {
        Intrinsics.checkNotNullParameter(j0Var, str);
        Intrinsics.checkNotNullParameter(cVar, str2);
        return j0Var.getViewModelStore();
    }

    public static BaseViewModel i(int i10, ig.b bVar, e0 e0Var, PortfolioDetailActivity portfolioDetailActivity) {
        e0Var.observe(portfolioDetailActivity, new v(i10, bVar));
        return portfolioDetailActivity.x();
    }

    public static fq.c j(eb.f fVar, i0 i0Var) {
        i0Var.b(fVar.p());
        return i0Var.a();
    }

    public static o k(int i10, r rVar, o oVar) {
        return androidx.compose.ui.draw.a.b(oVar, h.b(j.R(i10, rVar)));
    }

    public static n l(Class cls, String str, String str2, int i10, b0 b0Var) {
        n nVar = new n(cls, str, str2, i10);
        b0Var.getClass();
        return nVar;
    }

    public static String m(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String n(String str, m mVar) {
        return str + mVar;
    }

    public static String o(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder p(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder q(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder r(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static x1 t(r rVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        rVar.s(z10);
        rVar.s(z11);
        rVar.s(z12);
        rVar.s(z13);
        return rVar.w();
    }

    public static y4.c u(j0 j0Var, String str, h1 h1Var, String str2) {
        Intrinsics.checkNotNullParameter(j0Var, str);
        y4.c defaultViewModelCreationExtras = j0Var.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(h1Var, str2);
        return defaultViewModelCreationExtras;
    }

    public static void v(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
    }

    public static void w(o oVar, r rVar, int i10, boolean z10, boolean z11) {
        s.a(oVar, rVar, i10);
        rVar.s(z10);
        rVar.s(z11);
    }

    public static void x(String str, SparseArray sparseArray, int i10, String str2, int i11) {
        sparseArray.put(i10, Collections.singletonList(str));
        sparseArray.put(i11, Collections.singletonList(str2));
    }

    public static boolean y(Bundle bundle, String str, Class cls, String str2) {
        Intrinsics.checkNotNullParameter(bundle, str);
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str2);
    }

    public static /* synthetic */ String z(int i10) {
        switch (i10) {
            case 1:
                return "CONTINUOUS";
            case 2:
                return "TEXT";
            case 3:
                return "BINARY";
            case 4:
                return "PING";
            case 5:
                return "PONG";
            case 6:
                return "CLOSING";
            default:
                throw null;
        }
    }
}
