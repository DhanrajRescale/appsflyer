package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f12620a = {"time_spent", "latitude", "longitude", "city", "country", "region", "postal_code", "locality", "opt_in_push", "opt_in_inapp", "last_logged_in", "first_logged_in", "last_seen", "first_session_start_time", "session_count", "campaign_id", "campaign_source", "campaign_medium", "campaign_term", "campaign_content", "campaign_gclid", "referrer"};

    public static boolean a(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f12620a;
            if (i10 >= strArr.length) {
                return false;
            }
            if (strArr[i10].equals(str)) {
                return true;
            }
            i10++;
        }
    }
}
