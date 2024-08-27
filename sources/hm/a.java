package hm;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import aq.g0;
import com.google.android.gms.auth.api.credentials.Credential;
import zp.h;

/* loaded from: classes.dex */
public abstract class a {
    public static Credential a(h hVar, String str, String str2) {
        Uri parse;
        String str3 = ((g0) hVar).f2717b.f2707f;
        g0 g0Var = (g0) hVar;
        String str4 = g0Var.f2717b.f2708g;
        if (hVar.getPhotoUrl() == null) {
            parse = null;
        } else {
            parse = Uri.parse(hVar.getPhotoUrl().toString());
        }
        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
            Log.w("CredentialUtils", "User (accountType=" + str2 + ") has no email or phone number, cannot build credential.");
            return null;
        }
        if (str == null && str2 == null) {
            Log.w("CredentialUtils", "User has no accountType or password, cannot build credential.");
            return null;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = str4;
        }
        Credential.Builder profilePictureUri = new Credential.Builder(str3).setName(g0Var.f2717b.f2704c).setProfilePictureUri(parse);
        if (TextUtils.isEmpty(str)) {
            profilePictureUri.setAccountType(str2);
        } else {
            profilePictureUri.setPassword(str);
        }
        return profilePictureUri.build();
    }
}
