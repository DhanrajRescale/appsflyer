package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.crashlytics.internal.common.IdManager;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.bridge.ThreeDS2Bridge;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.EncHelper;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.ReceiverInterface;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.mystique.SwypeLayout;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import in.juspay.hypersdk.utils.network.SessionizedNetUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JBridge extends DuiInterface implements ReceiverInterface {
    private static final String LOG_TAG = "JBridge";
    private final int JUSPAY_LOADER_ID;

    @NonNull
    private final Set<String> acceptedCerts;
    private BroadcastReceiver broadcastReceiver;
    private NetUtils netUtils;
    private NetUtils netUtilsSsl;

    /* renamed from: in.juspay.hypersdk.core.JBridge$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            JBridge.this.receiverCallback(intent);
        }
    }

    /* renamed from: in.juspay.hypersdk.core.JBridge$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends AsyncTask<Object, Object, Object> {
        final /* synthetic */ String val$callback;
        final /* synthetic */ String val$data;
        final /* synthetic */ DynamicUI val$dynamicUI;
        final /* synthetic */ String val$headers;
        final /* synthetic */ JSONObject val$jsonOptions;
        final /* synthetic */ String val$method;
        final /* synthetic */ NetUtils val$netUtils;
        final /* synthetic */ SdkTracker val$sdkTracker;
        final /* synthetic */ boolean val$shouldEncodeToFormData;
        final /* synthetic */ Long val$startTime;
        final /* synthetic */ String val$url;

        public AnonymousClass2(SdkTracker sdkTracker, String str, Long l10, String str2, String str3, JSONObject jSONObject, String str4, DynamicUI dynamicUI, String str5, boolean z10, NetUtils netUtils) {
            r2 = sdkTracker;
            r3 = str;
            r4 = l10;
            r5 = str2;
            r6 = str3;
            r7 = jSONObject;
            r8 = str4;
            r9 = dynamicUI;
            r10 = str5;
            r11 = z10;
            r12 = netUtils;
        }

        private HashMap<String, String> toMap(String str) {
            HashMap<String, String> hashMap = new HashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
                return hashMap;
            } catch (JSONException unused) {
                JBridge.this.juspayServices.sdkDebug(JBridge.LOG_TAG, "Not a json string. Passing as such");
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: doInBackground */
        public Object doInBackground2(Object[] objArr) {
            try {
                HashMap<String, String> map = toMap(r10);
                HashMap<String, String> map2 = r11 ? toMap(r5) : null;
                if ("GET".equals(r6)) {
                    return new JuspayHttpsResponse(r12.doGet(r3, map, map2, r7));
                }
                if ("HEAD".equals(r6)) {
                    return new JuspayHttpsResponse(r12.doHead(r3, map, map2, r7));
                }
                if ("POST".equals(r6)) {
                    return map2 == null ? new JuspayHttpsResponse(r12.postUrl(new URL(r3), map, r5, r7)) : new JuspayHttpsResponse(r12.postUrl(new URL(r3), map, map2, r7));
                }
                if ("DELETE".equals(r6)) {
                    return map2 == null ? new JuspayHttpsResponse(r12.deleteUrl(new URL(r3), map, r5, r7)) : new JuspayHttpsResponse(r12.deleteUrl(new URL(r3), map, map2, r7));
                }
                if ("PUT".equals(r6)) {
                    return new JuspayHttpsResponse(r12.doPut(JBridge.this.juspayServices.getContext(), new URL(r3), r5.getBytes(), map, r12, r7));
                }
                return null;
            } catch (SocketTimeoutException e10) {
                r2.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, r4, Long.valueOf(System.currentTimeMillis()), r5, r3, r6, "SocketTimeoutException while calling api", e10, r7.optJSONArray("channels"), r7.optJSONObject("rootLogFields"));
                return new JuspayHttpsResponse(-3, "Socket Timeout".getBytes(), null);
            } catch (SSLHandshakeException e11) {
                r2.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, r4, Long.valueOf(System.currentTimeMillis()), r5, r3, r6, "SSLHandshakeException while calling api", e11, r7.optJSONArray("channels"), r7.optJSONObject("rootLogFields"));
                return new JuspayHttpsResponse(-2, "SSL Handshake Failed".getBytes(), null);
            } catch (IOException e12) {
                r2.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, r4, Long.valueOf(System.currentTimeMillis()), r5, r3, r6, "IOException while calling api", e12, r7.optJSONArray("channels"), r7.optJSONObject("rootLogFields"));
                return new JuspayHttpsResponse(-1, "Network Error".getBytes(), null);
            } catch (Exception e13) {
                r2.trackAndLogApiException(JBridge.LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.NETWORK, Labels.Network.NETWORK_CALL, r4, Long.valueOf(System.currentTimeMillis()), r5, r3, r6, "Exception while calling api", e13, r7.optJSONArray("channels"), r7.optJSONObject("rootLogFields"));
                byte[] bArr = new byte[0];
                if (e13.getLocalizedMessage() != null) {
                    bArr = e13.getLocalizedMessage().getBytes();
                }
                return new JuspayHttpsResponse(-1, bArr, null);
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            String format;
            String encodeToString;
            String str;
            String str2;
            if (obj != null) {
                JuspayHttpsResponse juspayHttpsResponse = (JuspayHttpsResponse) obj;
                if (juspayHttpsResponse.responsePayload != null) {
                    r2.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.NETWORK_CALL, Integer.valueOf(juspayHttpsResponse.responseCode), r3, r4, Long.valueOf(System.currentTimeMillis()), r5, new String(juspayHttpsResponse.responsePayload), r6, r7.optJSONArray("channels"), r7.optJSONObject("rootLogFields"));
                } else {
                    r2.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.NETWORK_CALL, Integer.valueOf(juspayHttpsResponse.responseCode), r3, r4, Long.valueOf(System.currentTimeMillis()), r5, null, r6, r7.optJSONArray("channels"), r7.optJSONObject("rootLogFields"));
                }
                int i10 = juspayHttpsResponse.responseCode;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (i10 != -1 && i10 != -2 && i10 != -3) {
                    byte[] bArr = juspayHttpsResponse.responsePayload;
                    if (bArr == null) {
                        encodeToString = HttpUrl.FRAGMENT_ENCODE_SET;
                        str2 = encodeToString;
                    } else {
                        String str4 = new String(bArr);
                        try {
                            String jSONObject = new JSONObject(str4).toString();
                            JBridge.this.juspayServices.sdkDebug("message", jSONObject);
                            encodeToString = Base64.encodeToString(jSONObject.getBytes(), 2);
                            str2 = URLEncoder.encode(jSONObject, "UTF-8").replace("+", "%20");
                        } catch (Exception e10) {
                            encodeToString = Base64.encodeToString(str4.getBytes(), 2);
                            try {
                                str = URLEncoder.encode(str4, "UTF-8").replace("+", "%20");
                            } catch (Exception unused) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            JuspayLogger.e(JBridge.LOG_TAG, "This happened: ", e10);
                            str2 = str;
                        }
                    }
                    JuspayServices juspayServices = JBridge.this.juspayServices;
                    StringBuilder r10 = da.e.r(encodeToString, " ");
                    r10.append(juspayHttpsResponse.responseCode);
                    juspayServices.sdkDebug("Response inserted: ", r10.toString());
                    if (juspayHttpsResponse.headers != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry<String, List<String>> entry : juspayHttpsResponse.headers.entrySet()) {
                            try {
                                jSONObject2.put(entry.getKey(), new JSONArray((Collection) entry.getValue()));
                            } catch (Exception unused2) {
                            }
                        }
                        try {
                            JBridge.this.juspayServices.sdkDebug("headers", jSONObject2.toString());
                            str3 = Base64.encodeToString(jSONObject2.toString().getBytes(), 2);
                        } catch (Exception e11) {
                            JuspayLogger.e(JBridge.LOG_TAG, "This happened: ", e11);
                        }
                    }
                    JuspayServices juspayServices2 = JBridge.this.juspayServices;
                    StringBuilder r11 = da.e.r(str3, " ");
                    r11.append(juspayHttpsResponse.responseCode);
                    juspayServices2.sdkDebug("Headers inserted: ", r11.toString());
                    String str5 = r8;
                    if (str5 != null) {
                        format = String.format("window.callUICallback('%s','%s','%s','%s','%s','%s', '%s');", str5, "success", encodeToString, Integer.valueOf(juspayHttpsResponse.responseCode), Base64.encodeToString(r3.getBytes(), 2), str3, str2);
                        JBridge.this.juspayServices.sdkDebug("Js inserted: ", format);
                    } else {
                        return;
                    }
                } else {
                    byte[] bytes = "{}".getBytes();
                    String encodeToString2 = Base64.encodeToString(bytes, 2);
                    String str6 = r8;
                    if (str6 != null) {
                        try {
                            format = String.format("window.callUICallback('%s','%s','%s','%s','%s','%s', '%s');", str6, "failure", encodeToString2, Integer.valueOf(juspayHttpsResponse.responseCode), Base64.encodeToString(r3.getBytes(), 2), HttpUrl.FRAGMENT_ENCODE_SET, URLEncoder.encode(Arrays.toString(bytes), "UTF-8").replace("+", "%20"));
                        } catch (UnsupportedEncodingException unused3) {
                            format = String.format("window.callUICallback('%s','%s','%s','%s','%s');", r8, "failure", encodeToString2, Integer.valueOf(juspayHttpsResponse.responseCode), Base64.encodeToString(r3.getBytes(), 2));
                        }
                    } else {
                        return;
                    }
                }
            } else {
                r2.trackApiCalls(LogSubCategory.ApiCall.NETWORK, "info", Labels.Network.NETWORK_CALL, -1, r3, r4, Long.valueOf(System.currentTimeMillis()), r5, "failure", r6, r7.optJSONArray("channels"), r7.optJSONObject("rootLogFields"));
                if (r8 != null) {
                    format = String.format("window.callUICallback('%s','%s','%s','%s','%s','%s');", r8, "failure", Base64.encodeToString("{}".getBytes(), 2), -1, Base64.encodeToString(r3.getBytes(), 2), "%7B%7D");
                } else {
                    return;
                }
            }
            r9.addJsToWebView(format);
        }
    }

    public JBridge(@NonNull JuspayServices juspayServices) {
        super(juspayServices);
        this.JUSPAY_LOADER_ID = 898989;
        this.broadcastReceiver = null;
        this.acceptedCerts = new HashSet();
        try {
            this.netUtils = new SessionizedNetUtils(((DuiInterface) this).sessionInfo, 0, 0, false);
            this.netUtilsSsl = new SessionizedNetUtils(((DuiInterface) this).sessionInfo, 0, 0, true);
        } catch (Exception e10) {
            juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while instantiating NetUtils", e10);
        }
    }

    public static float dpToPx(float f10, Context context) {
        return (context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f10;
    }

    private void drawIcon(Drawable drawable, int i10) {
        ExecutorManager.runOnMainThread(new j(this, i10, drawable, this.juspayServices.getSdkTracker()));
    }

    private Map<String, String> getDecodedQueryParameters(String str) {
        if (str == null || str.trim().length() < 1) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=");
            hashMap.put(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8").trim(), URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8").trim());
        }
        return hashMap;
    }

    @JavascriptInterface
    public static String hmacDigest(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), str3);
            Mac mac = Mac.getInstance(str3);
            mac.init(secretKeySpec);
            byte[] doFinal = mac.doFinal(str.getBytes(StandardCharsets.US_ASCII));
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : doFinal) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public /* synthetic */ void lambda$blurBackground$8(RenderScript renderScript, int i10, View view, View view2) {
        new BlurProcessor(renderScript, i10, this.activity).blurView(view, view2);
    }

    public /* synthetic */ void lambda$drawIcon$2(int i10, Drawable drawable, SdkTracker sdkTracker) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        View findViewById = activity.findViewById(i10);
        ImageView imageView = new ImageView(this.activity);
        imageView.setImageDrawable(drawable);
        if (findViewById != null) {
            ((ViewGroup) findViewById).addView(imageView);
        } else {
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.JBRIDGE, "draw_icon", jr.h.o("No view at ", i10, " found to attach the image."));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void lambda$hideJuspayLoader$1(java.lang.String r6) {
        /*
            r5 = this;
            android.app.Activity r0 = r5.activity
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 898989(0xdb7ad, float:1.259752E-39)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 != 0) goto Lf
            return
        Lf:
            r1 = 1065353216(0x3f800000, float:1.0)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3b
            r2.<init>(r6)     // Catch: java.lang.Exception -> L3b
            java.lang.String r6 = "animationDuration"
            java.lang.String r3 = "1000"
            java.lang.String r6 = r2.optString(r6, r3)     // Catch: java.lang.Exception -> L3b
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "startAlpha"
            java.lang.String r4 = "1.0"
            java.lang.String r3 = r2.optString(r3, r4)     // Catch: java.lang.Exception -> L3d
            float r1 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = "endAlpha"
            java.lang.String r4 = "0.0"
            java.lang.String r2 = r2.optString(r3, r4)     // Catch: java.lang.Exception -> L3d
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3b:
            r6 = 1000(0x3e8, float:1.401E-42)
        L3d:
            r2 = 0
        L3e:
            android.view.animation.AlphaAnimation r3 = new android.view.animation.AlphaAnimation
            r3.<init>(r1, r2)
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r3.setInterpolator(r1)
            long r1 = (long) r6
            r3.setDuration(r1)
            r0.setAnimation(r3)
            in.juspay.hypersdk.core.JuspayServices r6 = r5.juspayServices
            android.widget.FrameLayout r6 = r6.getContainer()
            if (r6 == 0) goto L5d
            r6.removeView(r0)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.JBridge.lambda$hideJuspayLoader$1(java.lang.String):void");
    }

    public /* synthetic */ void lambda$newDialogWithoutDateField$3(String str, DatePicker datePicker, int i10, int i11, int i12) {
        invokeCallbackInDUIWebview(str, i10 + "/" + (i11 + 1) + "/" + i12);
    }

    public /* synthetic */ void lambda$newDialogWithoutDateField$4(String str, DialogInterface dialogInterface) {
        invokeCallbackInDUIWebview(str, "NaN-NaN");
    }

    public /* synthetic */ void lambda$newDialogWithoutDateField$5(String str, DialogInterface dialogInterface) {
        invokeCallbackInDUIWebview(str, "NaN-NaN");
    }

    public /* synthetic */ void lambda$showJuspayLoader$0(String str) {
        int i10;
        String str2 = "Processing your payment";
        Activity activity = this.activity;
        if (activity != null && activity.findViewById(898989) == null) {
            int i11 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            float f10 = s0.g.f34069a;
            float f11 = 1.0f;
            try {
                JSONObject jSONObject = new JSONObject(str);
                i10 = Integer.parseInt(jSONObject.optString("rotationDuration", "2100"));
                try {
                    i11 = Integer.parseInt(jSONObject.optString("animationDuration", "1000"));
                    f10 = Float.parseFloat(jSONObject.optString("startAlpha", IdManager.DEFAULT_VERSION_NAME));
                    f11 = Float.parseFloat(jSONObject.optString("endAlpha", "1.0"));
                    str2 = jSONObject.optString("message", "Processing your payment");
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                i10 = 2100;
            }
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
            linearLayout.setGravity(17);
            linearLayout.setId(898989);
            linearLayout.setClickable(true);
            LinearLayout linearLayout2 = new LinearLayout(this.activity);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(1);
            ImageView imageView = new ImageView(this.activity);
            imageView.setBackgroundResource(R.drawable.juspay_icon);
            imageView.setLayoutParams(new LinearLayout.LayoutParams((int) dpToPx(48.0f, this.activity), (int) dpToPx(48.0f, this.activity)));
            RotateAnimation rotateAnimation = new RotateAnimation(s0.g.f34069a, 350.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(i10);
            imageView.startAnimation(rotateAnimation);
            TextView textView = new TextView(this.activity);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView.setPadding(0, (int) dpToPx(10.0f, this.activity), 0, (int) dpToPx(20.0f, this.activity));
            textView.setTextSize(16.0f);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setText(str2);
            ImageView imageView2 = new ImageView(this.activity);
            imageView2.setBackgroundResource(R.drawable.juspay_safe);
            imageView2.setLayoutParams(new LinearLayout.LayoutParams((int) dpToPx(90.0f, this.activity), (int) dpToPx(12.0f, this.activity)));
            ((LinearLayout.LayoutParams) imageView2.getLayoutParams()).setMargins(0, (int) dpToPx(24.0f, this.activity), 0, 0);
            linearLayout2.addView(imageView);
            linearLayout2.addView(imageView2);
            linearLayout2.addView(textView);
            linearLayout.addView(linearLayout2);
            Animation alphaAnimation = new AlphaAnimation(f10, f11);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(i11);
            linearLayout.setAnimation(alphaAnimation);
            FrameLayout container = this.juspayServices.getContainer();
            if (container != null) {
                container.addView(linearLayout);
            }
        }
    }

    public /* synthetic */ void lambda$startDatePicker$6(String str, String str2, String str3) {
        DatePickerDialog newDialogWithoutDateField = newDialogWithoutDateField(str);
        if (newDialogWithoutDateField == null) {
            return;
        }
        if (str2 != null && !str2.isEmpty() && !str2.equals("undefined")) {
            newDialogWithoutDateField.getDatePicker().setMinDate(dateToMillisecond(str2));
        }
        if (str3 != null && !str3.isEmpty() && !str3.equals("undefined")) {
            newDialogWithoutDateField.getDatePicker().setMaxDate(dateToMillisecond(str3));
        }
        View findViewById = newDialogWithoutDateField.getDatePicker().findViewById(Resources.getSystem().getIdentifier("day", "id", LogSubCategory.LifeCycle.ANDROID));
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        newDialogWithoutDateField.show();
    }

    public void lambda$startLottieAnimation$7(int i10, String str, boolean z10, float f10, float f11, SdkTracker sdkTracker) {
        int i11;
        try {
            Activity activity = this.activity;
            if (activity == null) {
                return;
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) activity.findViewById(i10);
            j9.y yVar = lottieAnimationView.f8363h;
            if (!yVar.f21235l) {
                yVar.f21235l = true;
                if (yVar.f21224a != null) {
                    yVar.c();
                }
            }
            lottieAnimationView.setAnimation(str);
            if (z10) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            lottieAnimationView.setRepeatCount(i11);
            lottieAnimationView.f8363h.t(f10, f11);
            lottieAnimationView.d();
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while playing Lottie animation", e10);
        }
    }

    private DatePickerDialog newDialogWithoutDateField(final String str) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: in.juspay.hypersdk.core.e0
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                JBridge.this.lambda$newDialogWithoutDateField$3(str, datePicker, i10, i11, i12);
            }
        };
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: in.juspay.hypersdk.core.f0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                JBridge.this.lambda$newDialogWithoutDateField$4(str, dialogInterface);
            }
        };
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: in.juspay.hypersdk.core.g0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                JBridge.this.lambda$newDialogWithoutDateField$5(str, dialogInterface);
            }
        };
        if (this.activity == null) {
            return null;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.activity, 2, onDateSetListener, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.setOnCancelListener(onCancelListener);
        datePickerDialog.setOnDismissListener(onDismissListener);
        return datePickerDialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:3:0x0012, B:5:0x001d, B:14:0x004d, B:17:0x004a, B:18:0x0061, B:20:0x002d, B:23:0x003a, B:26:0x009a, B:27:0x00a1), top: B:2:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void receiverCallback(android.content.Intent r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = "description"
            java.lang.String r3 = "transactionId"
            java.lang.String r4 = "status"
            java.lang.String r5 = "signature"
            in.juspay.hypersdk.core.JuspayServices r6 = r1.juspayServices
            in.juspay.hypersdk.core.SdkTracker r6 = r6.getSdkTracker()
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            r7.<init>()     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = r19.getAction()     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L9a
            int r9 = r8.hashCode()     // Catch: java.lang.Exception -> L37
            r10 = -2034547226(0xffffffff86bb45e6, float:-7.044429E-35)
            r11 = 1
            if (r9 == r10) goto L3a
            r10 = 1246126982(0x4a466386, float:3250401.5)
            if (r9 == r10) goto L2d
            goto L44
        L2d:
            java.lang.String r9 = "customtab-result"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L44
            r8 = r11
            goto L45
        L37:
            r0 = move-exception
            r13 = r0
            goto La2
        L3a:
            java.lang.String r9 = "amazonpay-result"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L44
            r8 = 0
            goto L45
        L44:
            r8 = -1
        L45:
            if (r8 == 0) goto L61
            if (r8 == r11) goto L4a
            goto L4d
        L4a:
            r18.handleCustomTabResult(r19)     // Catch: java.lang.Exception -> L37
        L4d:
            java.lang.String r8 = "external_sdk"
            java.lang.String r9 = "error"
            java.lang.String r10 = "receiver_callback"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r16 = "unknown_intent"
            r17 = 0
            r7 = r6
            r7.trackApiCalls(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L37
            goto Lb0
        L61:
            java.lang.String r8 = r0.getStringExtra(r5)     // Catch: java.lang.Exception -> L37
            r7.put(r5, r8)     // Catch: java.lang.Exception -> L37
            java.lang.String r5 = r0.getStringExtra(r4)     // Catch: java.lang.Exception -> L37
            r7.put(r4, r5)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r0.getStringExtra(r3)     // Catch: java.lang.Exception -> L37
            r7.put(r3, r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = r0.getStringExtra(r2)     // Catch: java.lang.Exception -> L37
            r7.put(r2, r3)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "orderCurrency"
            java.lang.String r3 = "orderTotalAmount"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch: java.lang.Exception -> L37
            r7.put(r2, r0)     // Catch: java.lang.Exception -> L37
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.listenerMap     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "amazonpay-result-cb"
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Exception -> L37
            r1.invokeCallbackInDUIWebview(r0, r2)     // Catch: java.lang.Exception -> L37
            goto Lb0
        L9a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "action is null"
            r0.<init>(r2)     // Catch: java.lang.Exception -> L37
            throw r0     // Catch: java.lang.Exception -> L37
        La2:
            java.lang.String r8 = "JBridge"
            java.lang.String r9 = "api_call"
            java.lang.String r10 = "external_sdk"
            java.lang.String r11 = "receiver_callback"
            java.lang.String r12 = "JSON Exception"
            r7 = r6
            r7.trackAndLogException(r8, r9, r10, r11, r12, r13)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.JBridge.receiverCallback(android.content.Intent):void");
    }

    private int versionCompare(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i10 = 0;
        while (i10 < split.length && i10 < split2.length && split[i10].equalsIgnoreCase(split2[i10])) {
            i10++;
        }
        return Integer.signum((i10 >= split.length || i10 >= split2.length) ? split.length - split2.length : Integer.valueOf(split[i10]).compareTo(Integer.valueOf(split2[i10])));
    }

    @JavascriptInterface
    public void addCertificates(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.acceptedCerts.add(jSONArray.getString(i10));
            }
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while manipulating JSON", e10);
        }
    }

    @Override // in.juspay.hyper.core.ReceiverInterface
    public void addToListenerMap(String str, String str2) {
        this.listenerMap.put(str, str2);
    }

    @JavascriptInterface
    @Deprecated
    public void amazonNonTokenPay(String str, String str2) {
        launchCustomTab(str, str2);
    }

    @JavascriptInterface
    public void attachBase64ImageToId(String str, String str2) {
        try {
            ImageView imageView = (ImageView) this.activity.findViewById(Integer.parseInt(str2));
            byte[] decode = Base64.decode(str, 0);
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void blurBackground(String str, String str2, final int i10) {
        if (Utils.isUiFeatureEnabled(this.juspayServices, "blurBackground")) {
            final RenderScript create = RenderScript.create(this.activity);
            Activity activity = this.activity;
            if (activity == null) {
                return;
            }
            final View findViewById = activity.findViewById(Integer.parseInt(str));
            final View findViewById2 = this.activity.findViewById(Integer.parseInt(str2));
            try {
                ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        JBridge.this.lambda$blurBackground$8(create, i10, findViewById, findViewById2);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    @JavascriptInterface
    public void callAPI(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5) {
        callAPIWithOptions(str, str2, str3, str4, z10, z11, new JSONObject().toString(), str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f3  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void callAPIWithOptions(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.JBridge.callAPIWithOptions(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public void checkAmazonNonTokenSdk(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            invokeCallbackInDUIWebview(str, "true");
        } catch (ClassNotFoundException e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.AMAZON_UTILS, "Amazon Sdk Not found Exception", e10);
            invokeCallbackInDUIWebview(str, "false");
        }
    }

    @JavascriptInterface
    public boolean checkCustomTabs() {
        return true;
    }

    @JavascriptInterface
    @Deprecated
    public void checkPhonePeSdk(String str) {
        invokeCallbackInDUIWebview(str, String.valueOf(checkPhonePeSdk()));
    }

    @JavascriptInterface
    public void copyLink(String str, String str2, String str3) {
        ((ClipboardManager) this.juspayServices.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str));
        invokeCallbackInDUIWebview(str3, "true");
    }

    @JavascriptInterface
    public int cursorPosition(int i10) {
        EditText editText;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            Activity activity = this.activity;
            if (activity == null || (editText = (EditText) activity.findViewById(i10)) == null) {
                return 0;
            }
            return editText.getSelectionStart();
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Cursor Position Exception", e10);
            return 0;
        }
    }

    public long dateToMillisecond(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (ParseException e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error in date to millis", e10);
            return 0L;
        }
    }

    @JavascriptInterface
    public boolean doesPhonePeAppExist(String str) {
        long j10;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.juspayServices.getContext().getPackageManager().getPackageInfo(str, 1);
            j10 = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, Labels.System.JBRIDGE, "Failed to get phonepe package name", e10);
            j10 = -1;
            packageInfo = packageInfo;
        }
        return packageInfo != null && j10 > 94033;
    }

    @JavascriptInterface
    public void drawAppIcon(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
                drawIcon(packageManager.getApplicationInfo(jSONObject.getString("packageName"), 0).loadIcon(packageManager), Integer.parseInt(jSONObject.getString("id")));
            }
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error happened while parsing json", e10);
        }
    }

    @JavascriptInterface
    public String encryptRSA(String str, String str2) {
        byte[] encryptRSAHelper = encryptRSAHelper(str, str2);
        return encryptRSAHelper == null ? HttpUrl.FRAGMENT_ENCODE_SET : Base64.encodeToString(encryptRSAHelper, 2);
    }

    public byte[] encryptRSAHelper(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----\n", HttpUrl.FRAGMENT_ENCODE_SET).replace("-----END PUBLIC KEY-----", HttpUrl.FRAGMENT_ENCODE_SET), 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, generatePublic);
            return cipher.doFinal(str2.getBytes());
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception when encrypting using RSA", e10);
            return null;
        }
    }

    @Override // in.juspay.hypersdk.core.HyperJsInterface
    @JavascriptInterface
    public void exitApp(int i10, String str) {
        SwypeLayout.clear();
        super.exitApp(i10, str);
    }

    @JavascriptInterface
    public String findApps(String str) {
        Throwable th2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
        Intent intent = new Intent();
        intent.setData(Uri.parse(str));
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        JSONArray jSONArray = new JSONArray();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            JSONObject jSONObject = new JSONObject();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(resolveInfo.activityInfo.packageName, 0);
                jSONObject.put("packageName", applicationInfo.packageName);
                jSONObject.put("appName", packageManager.getApplicationLabel(applicationInfo));
                jSONArray.put(jSONObject);
            } catch (PackageManager.NameNotFoundException e10) {
                th2 = e10;
                str2 = LOG_TAG;
                str3 = LogCategory.ACTION;
                str4 = LogSubCategory.Action.SYSTEM;
                str5 = Labels.System.JBRIDGE;
                str6 = "Error while searching for the app";
                sdkTracker.trackAndLogException(str2, str3, str4, str5, str6, th2);
            } catch (JSONException e11) {
                th2 = e11;
                str2 = LOG_TAG;
                str3 = LogCategory.ACTION;
                str4 = LogSubCategory.Action.SYSTEM;
                str5 = Labels.System.JBRIDGE;
                str6 = "Error While add to json";
                sdkTracker.trackAndLogException(str2, str3, str4, str5, str6, th2);
            }
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public String get3DS2SdkList() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, HyperBridge> entry : this.juspayServices.getJBridgeList().entrySet()) {
            if (entry.getValue() instanceof ThreeDS2Bridge) {
                jSONArray.put(((ThreeDS2Bridge) entry.getValue()).get3DS2SdkName());
            }
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public String getBuildInfo() {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("BOARD", Build.BOARD);
            jSONObject.put("BRAND", Build.BRAND);
            jSONObject.put("CPU_ABI", Build.CPU_ABI);
            jSONObject.put("CPU_ABI2", Build.CPU_ABI2);
            jSONObject.put("DEVICE", Build.DEVICE);
            jSONObject.put("DISPLAY", Build.DISPLAY);
            jSONObject.put("FINGERPRINT", Build.FINGERPRINT);
            jSONObject.put("HARDWARE", Build.HARDWARE);
            jSONObject.put("HOST", Build.HOST);
            jSONObject.put("ID", Build.ID);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject.put("MODEL", Build.MODEL);
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("RADIO", Build.getRadioVersion());
            jSONObject.put("TAGS", Build.TAGS);
            jSONObject.put("TIME", Build.TIME);
            jSONObject.put("USER", Build.USER);
            jSONObject.put("SUPPORTED_32_BIT_ABIS", new JSONArray(Build.SUPPORTED_32_BIT_ABIS));
            jSONObject.put("SUPPORTED_64_BIT_ABIS", new JSONArray(Build.SUPPORTED_64_BIT_ABIS));
            jSONObject.put("SUPPORTED_ABIS", new JSONArray(Build.SUPPORTED_ABIS));
            JSONObject jSONObject2 = new JSONObject();
            int i10 = Build.VERSION.SDK_INT;
            jSONObject2.put("BASE_OS", Build.VERSION.BASE_OS);
            jSONObject2.put("INCREMENTAL", Build.VERSION.INCREMENTAL);
            jSONObject2.put("PREVIEW_SDK_INT", Build.VERSION.PREVIEW_SDK_INT);
            jSONObject2.put("SECURITY_PATCH", Build.VERSION.SECURITY_PATCH);
            jSONObject2.put("RELEASE", Build.VERSION.RELEASE);
            jSONObject2.put("SDK_INT", i10);
            jSONObject.put("VERSION", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception fetching build info", e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @JavascriptInterface
    public float getDensity() {
        return this.juspayServices.getContext().getResources().getDisplayMetrics().densityDpi / 160.0f;
    }

    @JavascriptInterface
    public String getDeviceInfo() {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        JSONObject sessionData = this.juspayServices.getSessionInfo().getSessionData();
        try {
            sessionData.put("android_id_raw", this.juspayServices.getSessionInfo().getAndroidId());
            return sessionData.toString();
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while extracting android id", e10);
            return getSessionInfo();
        }
    }

    @JavascriptInterface
    @Deprecated
    public void getPackageName(String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            invokeCallbackInDUIWebview(str, this.juspayServices.getContext().getPackageName());
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "NULL Pointer Exception while getting package name", e10);
            invokeCallbackInDUIWebview(str, "ERROR");
        }
    }

    @JavascriptInterface
    public long getPhonePeVersionCode(String str) {
        PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
        if (!doesPhonePeAppExist(str)) {
            return -1L;
        }
        try {
            return packageManager.getPackageInfo(str, 1).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1L;
        }
    }

    @JavascriptInterface
    public String getResourceByName(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            int identifier = this.juspayServices.getContext().getResources().getIdentifier(str, str2, str3);
            if (identifier > 0) {
                return super.getResourceById(identifier);
            }
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Get Resource Exception", e10);
        }
        return "0";
    }

    @JavascriptInterface
    public String getSHA256Hash(String str) {
        if (str == null) {
            return null;
        }
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            String bytesToHexString = EncHelper.bytesToHexString(messageDigest.digest());
            JuspayLogger.d(LOG_TAG, "result is " + bytesToHexString);
            return bytesToHexString;
        } catch (NoSuchAlgorithmException e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception caught trying to SHA-256 hash", e10);
            return null;
        }
    }

    @JavascriptInterface
    public String getStatusBarHeight(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            int identifier = this.juspayServices.getContext().getResources().getIdentifier(str, str2, str3);
            if (identifier > 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET + this.juspayServices.getContext().getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Get Resource Exception", e10);
        }
        return "0";
    }

    public void handleCustomTabResult(Intent intent) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            if (intent != null) {
                invokeCallbackInDUIWebview((String) this.listenerMap.get("customtab-result-cb"), Utils.toJSON(intent.getExtras()).toString());
            } else {
                invokeCallbackInDUIWebview((String) this.listenerMap.get("customtab-result-cb"), "{}");
            }
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.CUSTOM_TAB, "JSON Exception", e10);
            invokeCallbackInDUIWebview((String) this.listenerMap.get("customtab-result-cb"), "{}");
        }
    }

    @JavascriptInterface
    public void handlePhonepayActivityResult(String str) {
        invokeCallbackInDUIWebview(HttpUrl.FRAGMENT_ENCODE_SET, str);
    }

    @JavascriptInterface
    public void hideJuspayLoader(String str) {
        ExecutorManager.runOnMainThread(new i0(this, str, 1));
    }

    @JavascriptInterface
    public void hideSoftInput() {
        InputMethodManager inputMethodManager;
        Activity activity = this.activity;
        if (activity == null || activity.getCurrentFocus() == null || (inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.activity.getCurrentFocus().getWindowToken(), 0);
    }

    @JavascriptInterface
    public boolean isCCTSupportedChromeAvailable(String str) {
        try {
            return CustomtabActivity.isChromeInstalled(CustomtabActivity.getCustomTabsPackages(this.juspayServices.getContext(), str));
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public boolean isNoLimitsActivity() {
        Activity activity = this.activity;
        return activity != null && (activity.getWindow().getAttributes().flags & 512) == 512;
    }

    @JavascriptInterface
    public boolean isShimmerPossible() {
        try {
            Class.forName("com.facebook.shimmer.ShimmerFrameLayout");
            Class.forName("com.facebook.shimmer.Shimmer");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public String jweDecrypt(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            KeyPair keyPair = EncHelper.getKeyPair(str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PaymentConstants.PAYLOAD, JOSEUtils.jweDecrypt(str, keyPair.getPrivate()));
            jSONObject.put("error", false);
            return jSONObject.toString();
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to decrypt JSON Web Token", e10);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e10);
        }
    }

    @JavascriptInterface
    public String jweEncrypt(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            return String.format("{\"error\":false,\"payload\":\"%s\"}", JOSEUtils.jweEncrypt(str, str2, Base64.decode(str3, 2)));
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to encrypt JSON Web Token", e10);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e10);
        }
    }

    @JavascriptInterface
    public String jwsSign(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            return String.format("{\"error\":false,\"payload\":\"%s\"}", JOSEUtils.jwsSign(str, str2, EncHelper.getKeyPair(str3).getPrivate()));
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to sign JSON Web Token", e10);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e10);
        }
    }

    @JavascriptInterface
    public boolean jwsVerify(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            return JOSEUtils.jwsVerify(str, Base64.decode(str2, 2));
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to verify JSON Web Token", e10);
            return false;
        }
    }

    @JavascriptInterface
    public void launchCustomTab(String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        this.listenerMap.put("customtab-result-cb", str2);
        try {
            if (this.juspayServices.isPaused()) {
                sdkTracker.trackAction(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.CUSTOM_TAB, "onPause called before launch customtab");
                unRegisterReceiver();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", "onPause");
                invokeCallbackInDUIWebview(str2, jSONObject.toString());
            } else {
                Intent intent = new Intent(this.juspayServices.getContext(), (Class<?>) CustomtabActivity.class);
                intent.putExtra("url", str);
                registerReceiver("customtab-result");
                this.juspayServices.startActivityForResult(intent, -1, null);
            }
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.CUSTOM_TAB, "Exception at launch customtab", e10);
            unRegisterReceiver();
            invokeCallbackInDUIWebview(str2, e10.toString());
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3, int i10, int i11) {
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction(str3);
        intent.setData(Uri.parse(str2));
        intent.setFlags(i10);
        this.juspayServices.startActivityForResult(intent, i11, null);
    }

    @Override // in.juspay.hyper.core.ReceiverInterface
    @JavascriptInterface
    public void registerReceiver(String str) {
        if (this.broadcastReceiver != null) {
            return;
        }
        this.broadcastReceiver = new BroadcastReceiver() { // from class: in.juspay.hypersdk.core.JBridge.1
            public AnonymousClass1() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                JBridge.this.receiverCallback(intent);
            }
        };
        a5.b.a(this.juspayServices.getContext()).b(this.broadcastReceiver, new IntentFilter(str));
    }

    @Override // in.juspay.hypersdk.core.DuiInterface
    public void reset() {
        super.reset();
        unRegisterReceiver();
    }

    @JavascriptInterface
    @Deprecated
    public String rsaEncryption(String str, String str2, String str3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 2)));
            Cipher cipher = Cipher.getInstance(str2);
            cipher.init(1, rSAPublicKey);
            return String.format("{\"error\":false,\"payload\":\"%s\"}", Base64.encodeToString(cipher.doFinal(str.getBytes()), 2));
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while trying to encrypt using RSA", e10);
            return String.format("{\"error\":true,\"payload\":\"%s\"}", e10);
        }
    }

    @JavascriptInterface
    public void shareLink(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.juspayServices.startActivityForResult(Intent.createChooser(intent, str2), -1, null);
        invokeCallbackInDUIWebview(str3, "true");
    }

    @JavascriptInterface
    public void showJuspayLoader(String str) {
        ExecutorManager.runOnMainThread(new i0(this, str, 0));
    }

    @JavascriptInterface
    public void startDatePicker(String str, String str2, String str3) {
        ExecutorManager.runOnMainThread(new e(this, str, str2, str3, 5));
    }

    @JavascriptInterface
    public void startLottieAnimation(final int i10, final String str, final boolean z10, final float f10, final float f11) {
        final SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.d0
            @Override // java.lang.Runnable
            public final void run() {
                JBridge.this.lambda$startLottieAnimation$7(i10, str, z10, f10, f11, sdkTracker);
            }
        });
    }

    @JavascriptInterface
    public void startPaytmRequest(String str, String str2, String str3) {
        JuspayServices juspayServices;
        String str4;
        String intent;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (versionCompare(str2, "8.6.0") < 0) {
                Intent intent2 = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("nativeSdkForMerchantAmount", jSONObject.optString("nativeSdkForMerchantAmount"));
                bundle.putString("orderid", jSONObject.optString("orderid"));
                bundle.putString("mid", jSONObject.optString("mid"));
                bundle.putString("txnToken", jSONObject.optString("txnToken"));
                intent2.setComponent(new ComponentName("net.one97.paytm", jSONObject.optString("net.one97.paytm")));
                intent2.putExtra("paymentmode", jSONObject.optInt("paymentmode"));
                intent2.putExtra("bill", bundle);
                this.juspayServices.startActivityForResult(intent2, 116, null);
                juspayServices = this.juspayServices;
                str4 = "paytmSDkParams1";
                intent = intent2.toString();
            } else {
                Intent intent3 = new Intent();
                intent3.setComponent(new ComponentName("net.one97.paytm", jSONObject.optString("net.one97.paytm")));
                intent3.putExtra("paymentmode", jSONObject.optInt("paymentmode"));
                intent3.putExtra("enable_paytm_invoke", jSONObject.optBoolean("enable_paytm_invoke"));
                intent3.putExtra("paytm_invoke", jSONObject.optBoolean("paytm_invoke"));
                intent3.putExtra("price", jSONObject.optString("price"));
                intent3.putExtra("nativeSdkEnabled", jSONObject.optBoolean("nativeSdkEnabled"));
                intent3.putExtra("orderid", jSONObject.optString("orderid"));
                intent3.putExtra("txnToken", jSONObject.optString("txnToken"));
                intent3.putExtra("mid", jSONObject.optString("mid"));
                this.juspayServices.startActivityForResult(intent3, 116, null);
                juspayServices = this.juspayServices;
                str4 = "paytmSDkParams2";
                intent = intent3.toString();
            }
            juspayServices.sdkDebug(str4, intent);
        } catch (JSONException e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, Labels.SDK.PAYTM_UTILS, "Paytm Init Exception", e10);
            invokeCallbackInDUIWebview(str3, e10.toString());
        }
    }

    @JavascriptInterface
    public void startPhonepeRequest(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setPackage(str2);
        this.juspayServices.startActivityForResult(intent, 113, null);
    }

    @Override // in.juspay.hyper.core.ReceiverInterface
    @JavascriptInterface
    public void unRegisterReceiver() {
        if (this.broadcastReceiver == null) {
            return;
        }
        a5.b.a(this.juspayServices.getContext()).d(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    @JavascriptInterface
    public void writeFileToDisk(String str, String str2, String str3) {
        invokeCallbackInDUIWebview(str3, this.juspayServices.getFileProviderService().writeFileToDisk(this.juspayServices.getContext(), str, str2));
    }

    @JavascriptInterface
    public boolean checkPhonePeSdk() {
        try {
            Class.forName("com.phonepe.android.sdk.api.PhonePe");
            Class.forName("com.phonepe.android.sdk.api.PhonePeInitException");
            Class.forName("com.phonepe.android.sdk.api.builders.TransactionRequestBuilder");
            Class.forName("com.phonepe.android.sdk.base.model.TransactionRequest");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    @Deprecated
    public void startPhonepeRequest(String str, String str2, String str3, String str4) {
        invokeCallbackInDUIWebview(str4, "Function deprecated");
    }
}
