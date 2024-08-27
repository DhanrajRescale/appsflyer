package com.airbnb.deeplinkdispatch;

import a5.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.base.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class BaseDeepLinkDelegate {
    protected static final String TAG = "DeepLinkDelegate";
    protected final Map<byte[], byte[]> configurablePathSegmentReplacements;
    protected final ErrorHandler errorHandler;
    protected final List<? extends BaseRegistry> registries;

    public BaseDeepLinkDelegate(List<? extends BaseRegistry> list) {
        this.registries = list;
        this.errorHandler = null;
        HashMap hashMap = new HashMap();
        this.configurablePathSegmentReplacements = hashMap;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements(list, hashMap);
    }

    private static void notifyListener(Context context, boolean z10, Uri uri, String str, String str2) {
        String str3;
        Intent intent = new Intent();
        intent.setAction(DeepLinkHandler.ACTION);
        if (uri != null) {
            str3 = uri.toString();
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        intent.putExtra(DeepLinkHandler.EXTRA_URI, str3);
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        intent.putExtra(DeepLinkHandler.EXTRA_URI_TEMPLATE, str);
        intent.putExtra(DeepLinkHandler.EXTRA_SUCCESSFUL, !z10);
        if (z10) {
            intent.putExtra(DeepLinkHandler.EXTRA_ERROR_MESSAGE, str2);
        }
        b.a(context).c(intent);
    }

    private void validateInput(Activity activity, Intent intent) {
        validateInput(activity);
        validateInput(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023b A[Catch: InvocationTargetException -> 0x0295, IllegalAccessException -> 0x02ba, NoSuchMethodException -> 0x02df, TryCatch #3 {NoSuchMethodException -> 0x02df, blocks: (B:33:0x00d6, B:35:0x00e5, B:38:0x023b, B:40:0x024f, B:42:0x0255, B:43:0x025c, B:45:0x0262, B:46:0x0269, B:48:0x027c, B:49:0x0281, B:51:0x00ee, B:85:0x01ac, B:87:0x01c7, B:91:0x01dc, B:93:0x01ed, B:95:0x01f7, B:97:0x0207, B:101:0x0216, B:102:0x0222, B:104:0x0228, B:106:0x022f), top: B:32:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024f A[Catch: InvocationTargetException -> 0x0295, IllegalAccessException -> 0x02ba, NoSuchMethodException -> 0x02df, TryCatch #3 {NoSuchMethodException -> 0x02df, blocks: (B:33:0x00d6, B:35:0x00e5, B:38:0x023b, B:40:0x024f, B:42:0x0255, B:43:0x025c, B:45:0x0262, B:46:0x0269, B:48:0x027c, B:49:0x0281, B:51:0x00ee, B:85:0x01ac, B:87:0x01c7, B:91:0x01dc, B:93:0x01ed, B:95:0x01f7, B:97:0x0207, B:101:0x0216, B:102:0x0222, B:104:0x0228, B:106:0x022f), top: B:32:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c7 A[Catch: InvocationTargetException -> 0x0295, IllegalAccessException -> 0x02ba, NoSuchMethodException -> 0x02df, TRY_LEAVE, TryCatch #3 {NoSuchMethodException -> 0x02df, blocks: (B:33:0x00d6, B:35:0x00e5, B:38:0x023b, B:40:0x024f, B:42:0x0255, B:43:0x025c, B:45:0x0262, B:46:0x0269, B:48:0x027c, B:49:0x0281, B:51:0x00ee, B:85:0x01ac, B:87:0x01c7, B:91:0x01dc, B:93:0x01ed, B:95:0x01f7, B:97:0x0207, B:101:0x0216, B:102:0x0222, B:104:0x0228, B:106:0x022f), top: B:32:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed A[Catch: InvocationTargetException -> 0x0295, IllegalAccessException -> 0x02ba, NoSuchMethodException -> 0x02df, TryCatch #3 {NoSuchMethodException -> 0x02df, blocks: (B:33:0x00d6, B:35:0x00e5, B:38:0x023b, B:40:0x024f, B:42:0x0255, B:43:0x025c, B:45:0x0262, B:46:0x0269, B:48:0x027c, B:49:0x0281, B:51:0x00ee, B:85:0x01ac, B:87:0x01c7, B:91:0x01dc, B:93:0x01ed, B:95:0x01f7, B:97:0x0207, B:101:0x0216, B:102:0x0222, B:104:0x0228, B:106:0x022f), top: B:32:0x00d6 }] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.airbnb.deeplinkdispatch.DeepLinkResult createResult(android.app.Activity r20, android.content.Intent r21, com.airbnb.deeplinkdispatch.DeepLinkMatchResult r22) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate.createResult(android.app.Activity, android.content.Intent, com.airbnb.deeplinkdispatch.DeepLinkMatchResult):com.airbnb.deeplinkdispatch.DeepLinkResult");
    }

    public DeepLinkResult dispatchFrom(Activity activity) {
        validateInput(activity);
        return dispatchFrom(activity, activity.getIntent());
    }

    public DeepLinkMatchResult findEntry(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        DeepLinkUri parse = DeepLinkUri.parse(str);
        Iterator<? extends BaseRegistry> it = this.registries.iterator();
        while (it.hasNext()) {
            DeepLinkMatchResult idxMatch = it.next().idxMatch(parse, this.configurablePathSegmentReplacements);
            if (idxMatch != null) {
                arrayList.add(idxMatch);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (DeepLinkMatchResult) arrayList.get(0);
        }
        Collections.sort(arrayList);
        if (((DeepLinkMatchResult) arrayList.get(0)).compareTo((DeepLinkMatchResult) arrayList.get(1)) == 0) {
            ErrorHandler errorHandler = this.errorHandler;
            if (errorHandler != null) {
                errorHandler.duplicateMatch(str, arrayList.subList(0, 2));
            }
            Log.w(TAG, "More than one match with the same concreteness!! (" + ((DeepLinkMatchResult) arrayList.get(0)).toString() + ") vs. (" + ((DeepLinkMatchResult) arrayList.get(1)).toString() + ")");
        }
        return (DeepLinkMatchResult) arrayList.get(0);
    }

    public List<DeepLinkEntry> getAllDeepLinkEntries() {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends BaseRegistry> it = this.registries.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getAllEntries());
        }
        return arrayList;
    }

    public List<? extends BaseRegistry> getRegistries() {
        return this.registries;
    }

    public boolean supportsUri(String str) {
        new ArrayList();
        DeepLinkUri parse = DeepLinkUri.parse(str);
        Iterator<? extends BaseRegistry> it = this.registries.iterator();
        while (it.hasNext()) {
            if (it.next().supports(parse, this.configurablePathSegmentReplacements)) {
                return true;
            }
        }
        return false;
    }

    private void validateInput(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("activity == null");
        }
    }

    public DeepLinkResult dispatchFrom(Activity activity, Intent intent) {
        DeepLinkResult createResult;
        validateInput(activity, intent);
        Uri data = intent.getData();
        if (data == null) {
            createResult = createResult(activity, intent, null);
        } else {
            createResult = createResult(activity, intent, findEntry(data.toString()));
        }
        if (createResult.getMethodResult().getTaskStackBuilder() != null) {
            createResult.getMethodResult().getTaskStackBuilder().g();
        } else if (createResult.getMethodResult().getIntent() != null) {
            activity.startActivity(createResult.getMethodResult().getIntent());
        }
        notifyListener(activity, !createResult.isSuccessful(), data, createResult.getDeepLinkEntry() != null ? createResult.getDeepLinkEntry().getDeeplinkEntry().getUriTemplate() : null, createResult.getError());
        return createResult;
    }

    public BaseDeepLinkDelegate(List<? extends BaseRegistry> list, ErrorHandler errorHandler) {
        this.registries = list;
        this.errorHandler = errorHandler;
        HashMap hashMap = new HashMap();
        this.configurablePathSegmentReplacements = hashMap;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements(list, hashMap);
    }

    private void validateInput(Intent intent) {
        if (intent == null) {
            throw new NullPointerException("sourceIntent == null");
        }
    }

    public BaseDeepLinkDelegate(List<? extends BaseRegistry> list, Map<String, String> map) {
        this.registries = list;
        this.errorHandler = null;
        Map<byte[], byte[]> byteArrayMap = Utils.toByteArrayMap(map);
        this.configurablePathSegmentReplacements = byteArrayMap;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements(list, byteArrayMap);
    }

    public BaseDeepLinkDelegate(List<? extends BaseRegistry> list, Map<String, String> map, ErrorHandler errorHandler) {
        this.registries = list;
        this.errorHandler = errorHandler;
        Map<byte[], byte[]> byteArrayMap = Utils.toByteArrayMap(map);
        this.configurablePathSegmentReplacements = byteArrayMap;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements(list, byteArrayMap);
    }
}
