package al;

import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import nl.e0;
import nl.n0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vt.p0;
import xk.g0;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f651a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f652b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f653c;

    static {
        b bVar = b.ANON_ID;
        n nVar = n.f697a;
        Pair pair = new Pair(bVar, new g(nVar, o.ANON_ID));
        Pair pair2 = new Pair(b.APP_USER_ID, new g(nVar, o.FB_LOGIN_ID));
        Pair pair3 = new Pair(b.ADVERTISER_ID, new g(nVar, o.MAD_ID));
        Pair pair4 = new Pair(b.PAGE_ID, new g(nVar, o.PAGE_ID));
        Pair pair5 = new Pair(b.PAGE_SCOPED_USER_ID, new g(nVar, o.PAGE_SCOPED_USER_ID));
        b bVar2 = b.ADV_TE;
        n nVar2 = n.f698b;
        f651a = p0.g(pair, pair2, pair3, pair4, pair5, new Pair(bVar2, new g(nVar2, o.ADV_TE)), new Pair(b.APP_TE, new g(nVar2, o.APP_TE)), new Pair(b.CONSIDER_VIEWS, new g(nVar2, o.CONSIDER_VIEWS)), new Pair(b.DEVICE_TOKEN, new g(nVar2, o.DEVICE_TOKEN)), new Pair(b.EXT_INFO, new g(nVar2, o.EXT_INFO)), new Pair(b.INCLUDE_DWELL_DATA, new g(nVar2, o.INCLUDE_DWELL_DATA)), new Pair(b.INCLUDE_VIDEO_DATA, new g(nVar2, o.INCLUDE_VIDEO_DATA)), new Pair(b.INSTALL_REFERRER, new g(nVar2, o.INSTALL_REFERRER)), new Pair(b.INSTALLER_PACKAGE, new g(nVar2, o.INSTALLER_PACKAGE)), new Pair(b.RECEIPT_DATA, new g(nVar2, o.RECEIPT_DATA)), new Pair(b.URL_SCHEMES, new g(nVar2, o.URL_SCHEMES)), new Pair(b.USER_DATA, new g(nVar, null)));
        Pair pair6 = new Pair(p.EVENT_TIME, new f(null, l.EVENT_TIME));
        Pair pair7 = new Pair(p.EVENT_NAME, new f(null, l.EVENT_NAME));
        p pVar = p.VALUE_TO_SUM;
        n nVar3 = n.f699c;
        f652b = p0.g(pair6, pair7, new Pair(pVar, new f(nVar3, l.VALUE_TO_SUM)), new Pair(p.CONTENT_IDS, new f(nVar3, l.CONTENT_IDS)), new Pair(p.CONTENTS, new f(nVar3, l.CONTENTS)), new Pair(p.CONTENT_TYPE, new f(nVar3, l.CONTENT_TYPE)), new Pair(p.CURRENCY, new f(nVar3, l.CURRENCY)), new Pair(p.DESCRIPTION, new f(nVar3, l.DESCRIPTION)), new Pair(p.LEVEL, new f(nVar3, l.LEVEL)), new Pair(p.MAX_RATING_VALUE, new f(nVar3, l.MAX_RATING_VALUE)), new Pair(p.NUM_ITEMS, new f(nVar3, l.NUM_ITEMS)), new Pair(p.PAYMENT_INFO_AVAILABLE, new f(nVar3, l.PAYMENT_INFO_AVAILABLE)), new Pair(p.REGISTRATION_METHOD, new f(nVar3, l.REGISTRATION_METHOD)), new Pair(p.SEARCH_STRING, new f(nVar3, l.SEARCH_STRING)), new Pair(p.SUCCESS, new f(nVar3, l.SUCCESS)), new Pair(p.ORDER_ID, new f(nVar3, l.ORDER_ID)), new Pair(p.AD_TYPE, new f(nVar3, l.AD_TYPE)));
        f653c = p0.g(new Pair("fb_mobile_achievement_unlocked", m.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", m.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", m.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", m.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", m.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", m.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", m.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", m.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", m.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", m.PURCHASED), new Pair("fb_mobile_rate", m.RATED), new Pair("fb_mobile_search", m.SEARCHED), new Pair("fb_mobile_spent_credits", m.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", m.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    public static final Object a(Object value, String rawValue) {
        String str;
        Intrinsics.checkNotNullParameter(rawValue, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        boolean a10 = Intrinsics.a(rawValue, "extInfo");
        h hVar = h.f647a;
        if (!a10 && !Intrinsics.a(rawValue, "url_schemes") && !Intrinsics.a(rawValue, "fb_content_id") && !Intrinsics.a(rawValue, "fb_content") && !Intrinsics.a(rawValue, FacebookSdk.DATA_PROCESSION_OPTIONS)) {
            boolean a11 = Intrinsics.a(rawValue, "advertiser_tracking_enabled");
            hVar = h.f648b;
            if (!a11 && !Intrinsics.a(rawValue, "application_tracking_enabled")) {
                hVar = Intrinsics.a(rawValue, "_logTime") ? h.f649c : null;
            }
        }
        if (value instanceof String) {
            str = (String) value;
        } else {
            str = null;
        }
        if (hVar != null && str != null) {
            int ordinal = hVar.ordinal();
            if (ordinal != 0) {
                boolean z10 = true;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return r.g(value.toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Integer g10 = r.g(str);
                if (g10 == null) {
                    return null;
                }
                if (g10.intValue() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
            try {
                ArrayList<??> g11 = n0.g(new JSONArray(str));
                ArrayList arrayList = new ArrayList();
                for (?? r12 : g11) {
                    try {
                        try {
                            r12 = n0.h(new JSONObject((String) r12));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        r12 = n0.g(new JSONArray((String) r12));
                    }
                    arrayList.add(r12);
                }
                return arrayList;
            } catch (JSONException e10) {
                e0.f28850c.s(g0.f40374e, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
                return Unit.f23355a;
            }
        }
        return value;
    }
}
