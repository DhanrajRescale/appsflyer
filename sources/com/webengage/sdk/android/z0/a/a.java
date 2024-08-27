package com.webengage.sdk.android.z0.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.webengage.sdk.android.actions.render.CallToAction;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class a extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f13016c;

    /* renamed from: d, reason: collision with root package name */
    Bundle f13017d;

    /* renamed from: e, reason: collision with root package name */
    CallToAction.TYPE f13018e;

    /* renamed from: f, reason: collision with root package name */
    boolean f13019f;

    /* renamed from: com.webengage.sdk.android.z0.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0011a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13020a;

        static {
            int[] iArr = new int[CallToAction.TYPE.values().length];
            f13020a = iArr;
            try {
                iArr[CallToAction.TYPE.LAUNCH_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13020a[CallToAction.TYPE.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(Context context) {
        super(context);
        this.f13016c = null;
        this.f13017d = null;
        this.f13018e = null;
        this.f13019f = false;
        this.f13016c = context.getApplicationContext();
    }

    private void r() {
        Intent launchIntentForPackage = this.f13016c.getPackageManager().getLaunchIntentForPackage(this.f13016c.getPackageName());
        Bundle bundle = this.f13017d;
        if (bundle != null && bundle.getBundle("custom_data") != null) {
            launchIntentForPackage.putExtras(this.f13017d.getBundle("custom_data"));
        }
        this.f13016c.startActivity(launchIntentForPackage);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r6.f13019f != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r6.f13019f != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00eb, code lost:
    
        if (r6.f13019f != false) goto L62;
     */
    @Override // com.webengage.sdk.android.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.z0.a.a.d(java.lang.Object):java.lang.Object");
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        List<String> list;
        Bundle extras = ((Intent) map.get("action_data")).getExtras();
        this.f13017d = extras;
        if (extras != null) {
            this.f13019f = extras.getBoolean("launch_app_if_invalid", false);
            String string = this.f13017d.getString("deeplink_uri");
            if (string != null) {
                try {
                    list = Uri.parse(string).getPathSegments();
                } catch (Exception unused) {
                    list = null;
                }
                if (list != null) {
                    if (list.size() > 0) {
                        this.f13018e = CallToAction.TYPE.valueFromString(list.get(0));
                    }
                    if (this.f13018e != null && list.size() > 1) {
                        return list.get(1);
                    }
                }
            }
        }
        return null;
    }
}
