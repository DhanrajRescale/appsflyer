package lp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static String[] f24982a;

    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(nn.d.h(20, "at index ", i11));
            }
        }
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static t1 c(Set set, g5.m mVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (set2 instanceof t1) {
                t1 t1Var = (t1) set2;
                kp.h hVar = t1Var.f25059b;
                hVar.getClass();
                return new t1((SortedSet) t1Var.f25058a, new kp.i(Arrays.asList(hVar, mVar)));
            }
            set2.getClass();
            return new t1(set2, mVar);
        }
        if (set instanceof t1) {
            t1 t1Var2 = (t1) set;
            kp.h hVar2 = t1Var2.f25059b;
            hVar2.getClass();
            return new t1((Set) t1Var2.f25058a, new kp.i(Arrays.asList(hVar2, mVar)));
        }
        set.getClass();
        return new t1(set, mVar);
    }

    public static zp.f d(String str, String str2) {
        if (zp.f.S(str2)) {
            return new zp.f(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }

    public static Object e(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object f(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return nn.d.g(list, 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int g(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int h(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public static s1 i(v0 v0Var, v0 v0Var2) {
        if (v0Var != null) {
            if (v0Var2 != null) {
                return new s1(v0Var, v0Var2);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }

    public static void j(Bundle bundle, String str) {
        String str2;
        try {
            pp.g.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            if (ek.u.B(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            tp.d dVar = (tp.d) pp.g.d().b(tp.d.class);
            if (dVar != null) {
                ((tp.e) dVar).a(AppMeasurement.FCM_ORIGIN, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static ArrayList k(Object... objArr) {
        int length = objArr.length;
        kp.j.A(length, "arraySize");
        ArrayList arrayList = new ArrayList(kp.j.W(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static boolean l(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void m(List list, kp.h hVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (hVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int n(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int o(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return n(hashCode);
    }

    public static Status p(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(":", 2);
            split[0] = split[0].trim();
            if (split.length > 1 && (str2 = split[1]) != null) {
                split[1] = str2.trim();
            }
            List asList = Arrays.asList(split);
            if (asList.size() > 1) {
                return q((String) asList.get(0), (String) asList.get(1));
            }
            return q((String) asList.get(0), null);
        }
        return new Status(17499);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Status q(String str, String str2) {
        char c10;
        int i10;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c10 = 'C';
                    break;
                }
                c10 = 65535;
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c10 = '/';
                    break;
                }
                c10 = 65535;
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c10 = '@';
                    break;
                }
                c10 = 65535;
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c10 = '-';
                    break;
                }
                c10 = 65535;
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c10 = '\'';
                    break;
                }
                c10 = 65535;
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c10 = ')';
                    break;
                }
                c10 = 65535;
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c10 = 'K';
                    break;
                }
                c10 = 65535;
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c10 = 'H';
                    break;
                }
                c10 = 65535;
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c10 = '\"';
                    break;
                }
                c10 = 65535;
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c10 = '2';
                    break;
                }
                c10 = 65535;
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c10 = 'N';
                    break;
                }
                c10 = 65535;
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c10 = '$';
                    break;
                }
                c10 = 65535;
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c10 = UrlTreeKt.configurablePathSegmentPrefixChar;
                    break;
                }
                c10 = 65535;
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c10 = ':';
                    break;
                }
                c10 = 65535;
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c10 = 'B';
                    break;
                }
                c10 = 65535;
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c10 = '(';
                    break;
                }
                c10 = 65535;
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c10 = '9';
                    break;
                }
                c10 = 65535;
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c10 = 'L';
                    break;
                }
                c10 = 65535;
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c10 = 'G';
                    break;
                }
                c10 = 65535;
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c10 = '*';
                    break;
                }
                c10 = 65535;
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c10 = '=';
                    break;
                }
                c10 = 65535;
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c10 = '7';
                    break;
                }
                c10 = 65535;
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c10 = 'M';
                    break;
                }
                c10 = 65535;
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c10 = UrlTreeKt.configurablePathSegmentSuffixChar;
                    break;
                }
                c10 = 65535;
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c10 = '3';
                    break;
                }
                c10 = 65535;
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c10 = '6';
                    break;
                }
                c10 = 65535;
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c10 = 'D';
                    break;
                }
                c10 = 65535;
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c10 = '+';
                    break;
                }
                c10 = 65535;
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c10 = 'I';
                    break;
                }
                c10 = 65535;
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c10 = 'J';
                    break;
                }
                c10 = 65535;
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c10 = ';';
                    break;
                }
                c10 = 65535;
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c10 = '4';
                    break;
                }
                c10 = 65535;
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c10 = '8';
                    break;
                }
                c10 = 65535;
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c10 = '%';
                    break;
                }
                c10 = 65535;
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c10 = '.';
                    break;
                }
                c10 = 65535;
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c10 = '0';
                    break;
                }
                c10 = 65535;
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c10 = '5';
                    break;
                }
                c10 = 65535;
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c10 = 'A';
                    break;
                }
                c10 = 65535;
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c10 = 'F';
                    break;
                }
                c10 = 65535;
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c10 = '&';
                    break;
                }
                c10 = 65535;
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c10 = '!';
                    break;
                }
                c10 = 65535;
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c10 = 'E';
                    break;
                }
                c10 = 65535;
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c10 = ',';
                    break;
                }
                c10 = 65535;
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c10 = '#';
                    break;
                }
                c10 = 65535;
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c10 = '?';
                    break;
                }
                c10 = 65535;
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c10 = '1';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                i10 = 17016;
                break;
            case 1:
                i10 = 17002;
                break;
            case 2:
                i10 = 17000;
                break;
            case 3:
            case 4:
                i10 = 17004;
                break;
            case 5:
                i10 = 17005;
                break;
            case 6:
            case 7:
                i10 = 17008;
                break;
            case '\b':
            case '\t':
                i10 = 17011;
                break;
            case '\n':
                i10 = 17007;
                break;
            case 11:
                i10 = 17009;
                break;
            case '\f':
                i10 = 17025;
                break;
            case '\r':
                i10 = 17017;
                break;
            case 14:
            case 15:
                i10 = 17020;
                break;
            case 16:
                i10 = 17026;
                break;
            case 17:
            case 18:
                i10 = 17006;
                break;
            case 19:
                i10 = 17028;
                break;
            case 20:
                i10 = 17014;
                break;
            case 21:
            case 22:
                i10 = 17010;
                break;
            case 23:
                i10 = 17021;
                break;
            case 24:
                i10 = 17030;
                break;
            case 25:
                i10 = 17029;
                break;
            case 26:
                i10 = 17031;
                break;
            case 27:
                i10 = 17032;
                break;
            case 28:
                i10 = 17033;
                break;
            case 29:
                i10 = 17034;
                break;
            case 30:
                i10 = 17035;
                break;
            case 31:
                i10 = 17041;
                break;
            case ' ':
                i10 = 17042;
                break;
            case '!':
                i10 = 17043;
                break;
            case '\"':
                i10 = 17044;
                break;
            case '#':
                i10 = 17045;
                break;
            case '$':
                i10 = 17046;
                break;
            case '%':
                i10 = 17049;
                break;
            case '&':
                i10 = 17051;
                break;
            case '\'':
                i10 = 17052;
                break;
            case '(':
                i10 = 17064;
                break;
            case ')':
                i10 = 17061;
                break;
            case '*':
                i10 = 17062;
                break;
            case '+':
                i10 = 17065;
                break;
            case ',':
                i10 = 17040;
                break;
            case '-':
                i10 = 17068;
                break;
            case '.':
                i10 = 17071;
                break;
            case '/':
                i10 = 17057;
                break;
            case '0':
                i10 = 17058;
                break;
            case '1':
                i10 = 17073;
                break;
            case '2':
                i10 = 17079;
                break;
            case '3':
                i10 = 17074;
                break;
            case '4':
                i10 = 17075;
                break;
            case '5':
                i10 = 17078;
                break;
            case '6':
                i10 = 17081;
                break;
            case '7':
                i10 = 17082;
                break;
            case '8':
                i10 = 17083;
                break;
            case '9':
                i10 = 17084;
                break;
            case ':':
                i10 = 17085;
                break;
            case ';':
                i10 = 17086;
                break;
            case '<':
                i10 = 17087;
                break;
            case '=':
                i10 = 17088;
                break;
            case '>':
                i10 = 17089;
                break;
            case '?':
                i10 = 17090;
                break;
            case '@':
                i10 = 17091;
                break;
            case 'A':
                i10 = 17093;
                break;
            case 'B':
                i10 = 17094;
                break;
            case 'C':
                i10 = 18001;
                break;
            case 'D':
                i10 = 17095;
                break;
            case 'E':
                i10 = 17201;
                break;
            case 'F':
                i10 = 17202;
                break;
            case 'G':
                i10 = 17203;
                break;
            case 'H':
                i10 = 17200;
                break;
            case 'I':
                i10 = 17204;
                break;
            case 'J':
                i10 = 17205;
                break;
            case 'K':
                i10 = 17206;
                break;
            case 'L':
                i10 = 17207;
                break;
            case 'M':
                i10 = 17056;
                break;
            case 'N':
                i10 = 18002;
                break;
            default:
                i10 = 17499;
                break;
        }
        if (i10 == 17499) {
            if (str2 != null) {
                return new Status(17499, a3.a.g(str, ":", str2));
            }
            return new Status(17499, str);
        }
        return new Status(i10, str2);
    }
}
