package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import in.juspay.hyper.core.JuspayLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class CustomtabActivity extends Activity {
    public static final String CUSTOMTAB_RESULT = "customtab-result";
    private static final String LOG_TAG = "CustomtabActivity";
    private Boolean isFirstResume = Boolean.TRUE;

    public static ArrayList<ResolveInfo> getCustomTabsPackages(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 131072);
        ArrayList<ResolveInfo> arrayList = new ArrayList<>();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public static boolean isChromeInstalled(ArrayList<ResolveInfo> arrayList) {
        Iterator<ResolveInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.packageName.equals("com.android.chrome")) {
                return true;
            }
        }
        return false;
    }

    private void launchInBrowser(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void launchIntentChooser(ArrayList<ResolveInfo> arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<ResolveInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ResolveInfo next = it.next();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setPackage(next.activityInfo.packageName);
            arrayList2.add(intent);
        }
        Intent createChooser = Intent.createChooser((Intent) arrayList2.remove(0), "Select app");
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
        startActivity(createChooser);
    }

    public void loadUrl(String str) {
        q.f a10 = new q.e().a();
        Uri parse = Uri.parse(str);
        Intent intent = a10.f31447a;
        intent.setData(parse);
        try {
            ArrayList<ResolveInfo> customTabsPackages = getCustomTabsPackages(getBaseContext(), str);
            if (customTabsPackages.size() <= 0) {
                launchInBrowser(str);
            } else if (isChromeInstalled(customTabsPackages)) {
                intent.setPackage("com.android.chrome");
                a10.a(this, Uri.parse(str));
            } else {
                launchIntentChooser(customTabsPackages, str);
            }
        } catch (Exception e10) {
            JuspayLogger.e(LOG_TAG, "Exception in customtab activity", e10);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        if (getIntent() != null && ((data = getIntent().getData()) == null || data.getHost() == null)) {
            Bundle extras = getIntent().getExtras();
            String string = extras == null ? null : extras.getString("url");
            if (string != null) {
                loadUrl(string);
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isFirstResume.booleanValue()) {
            this.isFirstResume = Boolean.FALSE;
            return;
        }
        Intent intent = new Intent("customtab-result");
        intent.putExtra("status", "CANCELLED");
        a5.b.a(this).c(intent);
        finish();
    }
}
