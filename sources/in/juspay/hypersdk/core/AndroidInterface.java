package in.juspay.hypersdk.core;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.annotation.NonNull;
import d4.n1;
import d4.w0;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.mystique.Callback;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AndroidInterface {
    private final DynamicUI dynamicUI;
    private String state;
    private final Map<String, PendingAddScreenMapItem> pendingAddScreenMap = new HashMap();
    private final Set<String> onGoingPrepareScreenSet = new HashSet();

    /* renamed from: in.juspay.hypersdk.core.AndroidInterface$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Animator.AnimatorListener {
        final /* synthetic */ String val$animId;
        final /* synthetic */ String val$callbackName;

        public AnonymousClass1(String str, String str2) {
            r2 = str;
            r3 = str2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            String str = r2;
            if (str != null && !str.isEmpty()) {
                DynamicUI dynamicUI = AndroidInterface.this.dynamicUI;
                StringBuilder sb2 = new StringBuilder("window.callUICallback('");
                sb2.append(r2);
                sb2.append("', '");
                dynamicUI.addJsToWebView(nn.d.o(sb2, r3, "');"));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class PendingAddScreenMapItem {
        String callbackName;
        int index;
        String parentId;
        boolean replaceChild;
        String runInUIprop;
        String screenName;

        public PendingAddScreenMapItem(String str, String str2, int i10, String str3, boolean z10, String str4) {
            this.parentId = str;
            this.screenName = str2;
            this.index = i10;
            this.callbackName = str3;
            this.replaceChild = z10;
            this.runInUIprop = str4;
        }
    }

    /* loaded from: classes2.dex */
    public static class PreRenderThread extends Thread {
        public PreRenderThread(Runnable runnable) {
            super(runnable);
            setName("PreRenderThread");
        }
    }

    public AndroidInterface(@NonNull DynamicUI dynamicUI) {
        this.dynamicUI = dynamicUI;
    }

    private int findChildIndex(int i10, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (viewGroup.getChildAt(i11).getId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    @NonNull
    private String getJSONResult(String str) {
        JSONArray jSONArray = new JSONArray(str);
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(this.dynamicUI.getActivity() == null);
        Object runJSON = inflateJSON.runJSON(null, jSONArray, inflateJSON.getUseAppContext(), null);
        return runJSON != null ? runJSON.toString() : "_null_";
    }

    public /* synthetic */ void lambda$addStoredViewToParent$3(String str, String str2, int i10, String str3, boolean z10, String str4, String str5) {
        try {
            if (this.onGoingPrepareScreenSet.contains(str)) {
                this.pendingAddScreenMap.put(str, new PendingAddScreenMapItem(str2, str, i10, str3, z10, str4));
            } else {
                this.dynamicUI.getRenderer().addStoredViewToParent(str2, str, i10, z10, str5);
                InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
                inflateJSON.setUseAppContext(true);
                this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getAppContext(), str4, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, inflateJSON.getUseAppContext());
                if (str3 != null) {
                    this.dynamicUI.addJsToWebView("window.callUICallback('" + str3 + "','success');");
                }
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__addStoredViewToParent  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__addStoredViewToParent  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
        }
    }

    public /* synthetic */ void lambda$addViewToParent$1(String str, JSONObject jSONObject, int i10, boolean z10, String str2, String str3) {
        try {
            this.dynamicUI.getRenderer().addViewToParent(str, jSONObject, i10, z10, str2);
            if (str3 != null) {
                this.dynamicUI.addJsToWebView("window.callUICallback('" + str3 + "','success');");
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__addViewToParent  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__addViewToParent  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
            if (str3 != null) {
                this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback('", str3, "','failure');"));
            }
        }
    }

    public /* synthetic */ void lambda$cancelAnim$18(ObjectAnimator objectAnimator, String str, String str2) {
        try {
            objectAnimator.cancel();
            float floatValue = ((Float) objectAnimator.getAnimatedValue()).floatValue();
            this.dynamicUI.addJsToWebView("window.callUICallback('" + str + "', '" + floatValue + "');");
        } catch (Exception unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error parsing json for animation with id " + str2);
        }
    }

    public /* synthetic */ void lambda$generateUIElement$15(String str, String str2, int i10, final String[] strArr, final String str3) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            this.dynamicUI.getLogger().e("missing_container", "render, no container");
        } else if (str2.equals("PopupMenu")) {
            container.findViewById(i10).setOnClickListener(new View.OnClickListener() { // from class: in.juspay.hypersdk.core.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AndroidInterface.this.lambda$generateUIElement$14(strArr, str3, view);
                }
            });
        }
    }

    public /* synthetic */ void lambda$moveView$5(String str, String str2, String str3) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container != null) {
                View findViewById = container.findViewById(Integer.parseInt(str2));
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                viewGroup.removeView(findViewById);
                viewGroup.addView(findViewById, Integer.parseInt(str3));
            } else {
                this.dynamicUI.getLogger().e("missing_container", "moveView, no container");
            }
        } catch (Exception unused) {
            this.dynamicUI.getLogger().e("ERROR", " fn__moveView - " + this.dynamicUI.getRenderer().getErrorDetails());
        }
    }

    public /* synthetic */ void lambda$prepareAndStoreView$2(String str, JSONObject jSONObject, String str2) {
        try {
            setPrepareScreenTaskStatus(str, true);
            this.dynamicUI.getRenderer().prepareAndStoreView(str, jSONObject);
            if (str2 != null) {
                this.dynamicUI.addJsToWebView("window.callUICallback('" + str2 + "','success');");
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__prepareAndStoreView  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__prepareAndStoreView  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
            if (str2 != null) {
                this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback('", str2, "','failure');"));
            }
        }
        setPrepareScreenTaskStatus(str, false);
        processPendingAddScreen(str);
    }

    public /* synthetic */ void lambda$processPendingAddScreen$21(String str) {
        PendingAddScreenMapItem pendingAddScreenMapItem = this.pendingAddScreenMap.get(str);
        if (pendingAddScreenMapItem != null) {
            this.pendingAddScreenMap.remove(str);
            addStoredViewToParent(pendingAddScreenMapItem.parentId, pendingAddScreenMapItem.screenName, pendingAddScreenMapItem.index, pendingAddScreenMapItem.callbackName, pendingAddScreenMapItem.replaceChild, pendingAddScreenMapItem.runInUIprop, null);
        }
    }

    public /* synthetic */ void lambda$removeView$6(String str, int i10) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            this.dynamicUI.getLogger().e("missing_container", "removeView, no container");
            return;
        }
        View findViewById = container.findViewById(i10);
        if (findViewById == null) {
            return;
        }
        ((ViewGroup) findViewById.getParent()).removeView(findViewById);
    }

    public /* synthetic */ void lambda$render$0(JSONObject jSONObject, String str, String str2, String str3) {
        try {
            this.dynamicUI.getRenderer().renderUI(jSONObject, this.dynamicUI.getContainer(str), Boolean.parseBoolean(str2), str);
            if (str3 != null) {
                this.dynamicUI.addJsToWebView("window.callUICallback(" + str3 + ",'success');");
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__Render  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__Render  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
            if (str3 != null) {
                this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback(", str3, ",'failure');"));
            }
        }
    }

    public /* synthetic */ void lambda$replaceView$4(String str, JSONObject jSONObject, int i10) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container == null) {
                this.dynamicUI.getLogger().e("missing_container", "replaceView, no container");
                return;
            }
            View createView = this.dynamicUI.getRenderer().createView(jSONObject);
            View findViewById = container.findViewById(i10);
            if (findViewById != null) {
                if (findViewById instanceof ViewGroup) {
                    int childCount = ((ViewGroup) findViewById).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((ViewGroup) findViewById).getChildAt(0);
                        if (childAt != null) {
                            ((ViewGroup) findViewById).removeViewAt(0);
                            ((ViewGroup) createView).addView(childAt, i11);
                        }
                    }
                }
                if (replaceViewImpl(createView, findViewById)) {
                    createView.requestLayout();
                }
            }
        } catch (JSONException unused) {
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e(e10.getLocalizedMessage(), "excep: fn__replaceView - Error while replaceView " + e10);
        }
    }

    public /* synthetic */ void lambda$runInUI$7(String str, String str2, String str3, String str4) {
        Renderer renderer;
        Context appContext;
        try {
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            if (this.dynamicUI.getActivity() != null) {
                inflateJSON.setUseAppContext(false);
                renderer = this.dynamicUI.getRenderer();
                appContext = this.dynamicUI.getActivity();
            } else {
                inflateJSON.setUseAppContext(true);
                renderer = this.dynamicUI.getRenderer();
                appContext = this.dynamicUI.getAppContext();
            }
            renderer.parseAndRunPipe(appContext, str, str2, str3, inflateJSON.getUseAppContext());
            if (str4 != null) {
                this.dynamicUI.addJsToWebView("window.callUICallback(" + str4 + ",'success');");
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__runInUI  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__runInUI  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
            if (str4 != null) {
                this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback(", str4, ",'failure');"));
            }
        }
    }

    public /* synthetic */ void lambda$runInUI$8(String str, String str2) {
        Renderer renderer;
        Context appContext;
        try {
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            if (this.dynamicUI.getActivity() != null) {
                inflateJSON.setUseAppContext(false);
                renderer = this.dynamicUI.getRenderer();
                appContext = this.dynamicUI.getActivity();
            } else {
                inflateJSON.setUseAppContext(true);
                renderer = this.dynamicUI.getRenderer();
                appContext = this.dynamicUI.getAppContext();
            }
            renderer.parseAndRunPipe(appContext, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, inflateJSON.getUseAppContext());
            if (str2 != null) {
                this.dynamicUI.addJsToWebView("window.callUICallback(" + str2 + ",'success');");
            }
        } catch (Exception e10) {
            String name = e10.getClass().getName();
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder s7 = da.e.s(" excep: fn__runInUI  - ", name, " - ");
            s7.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", s7.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder s10 = da.e.s(" excep: fn__runInUI  - ", name, " - ");
            s10.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onError("ERROR", s10.toString());
            if (str2 != null) {
                this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback(", str2, ",'failure');"));
            }
        }
    }

    public /* synthetic */ void lambda$setImage$12(String str, int i10, String str2) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container != null) {
                ImageView imageView = (ImageView) container.findViewById(i10);
                byte[] decode = Base64.decode(str2, 0);
                imageView.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
            } else {
                this.dynamicUI.getLogger().e("missing_container", "setImage, no container");
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__setImage  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__setImage  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
        }
    }

    public /* synthetic */ void lambda$setPrepareScreenTaskStatus$20(boolean z10, String str) {
        if (z10) {
            this.onGoingPrepareScreenSet.add(str);
        } else {
            this.onGoingPrepareScreenSet.remove(str);
        }
    }

    public /* synthetic */ boolean lambda$showPopup$16(String str, MenuItem menuItem) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder s7 = da.e.s("window.callUICallback('", str, "', '");
        s7.append(menuItem.getItemId());
        s7.append("');");
        dynamicUI.addJsToWebView(s7.toString());
        Toast.makeText(this.dynamicUI.getActivity(), "You Clicked : " + ((Object) menuItem.getTitle()), 0).show();
        return true;
    }

    public /* synthetic */ void lambda$startAnim$17(Pair pair, String str, String str2) {
        if (pair != null) {
            try {
                Object obj = pair.second;
                if (obj != null) {
                    ((ObjectAnimator) obj).start();
                    ((ObjectAnimator) pair.second).addListener(new Animator.AnimatorListener() { // from class: in.juspay.hypersdk.core.AndroidInterface.1
                        final /* synthetic */ String val$animId;
                        final /* synthetic */ String val$callbackName;

                        public AnonymousClass1(String str3, String str22) {
                            r2 = str3;
                            r3 = str22;
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(@NonNull Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(@NonNull Animator animator) {
                            String str3 = r2;
                            if (str3 != null && !str3.isEmpty()) {
                                DynamicUI dynamicUI = AndroidInterface.this.dynamicUI;
                                StringBuilder sb2 = new StringBuilder("window.callUICallback('");
                                sb2.append(r2);
                                sb2.append("', '");
                                dynamicUI.addJsToWebView(nn.d.o(sb2, r3, "');"));
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(@NonNull Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(@NonNull Animator animator) {
                        }
                    });
                }
            } catch (Exception unused) {
                this.dynamicUI.getLogger().e("JSONERROR", "Error parsing json for animation with id " + str22);
            }
        }
    }

    public /* synthetic */ void lambda$toggleKeyboard$13(String str, int i10, String str2) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            this.dynamicUI.getLogger().e("missing_container", "removeView, no container");
            return;
        }
        View findViewById = container.findViewById(i10);
        InputMethodManager inputMethodManager = (InputMethodManager) this.dynamicUI.getActivity().getSystemService("input_method");
        if (str2.equals("show")) {
            inputMethodManager.showSoftInput(findViewById, 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
        }
    }

    public /* synthetic */ void lambda$updateAnim$19(String str, int i10, JSONArray jSONArray) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container != null) {
                this.dynamicUI.getRenderer().getInflateView().handleAnimation(container.findViewById(i10), jSONArray);
            } else {
                this.dynamicUI.getLogger().e("missing_container", "updateAnim, no container");
            }
        } catch (Exception unused) {
            this.dynamicUI.getLogger().e("ERROR", "updateAnim: View doesn't exist for id -" + i10);
        }
    }

    public /* synthetic */ void lambda$updateProperties$11(String str, String str2) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container == null) {
                this.dynamicUI.getLogger().e("missing_container", "updateProperties, no container");
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            View findViewById = container.findViewById(jSONObject.getInt("id"));
            jSONObject.remove("id");
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            inflateJSON.setUseAppContext(true);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.dynamicUI.getRenderer().getInflateView().parseKeys(keys.next(), jSONObject, findViewById, inflateJSON.getUseAppContext());
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e(e10.getLocalizedMessage(), "excep: fn__updateProperties- Error while updateProperties " + e10);
        }
    }

    private boolean replaceViewImpl(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view2.getParent();
        int findChildIndex = findChildIndex(view2.getId(), viewGroup);
        if (findChildIndex == -1) {
            return false;
        }
        viewGroup.removeViewAt(findChildIndex);
        viewGroup.addView(view, findChildIndex);
        return true;
    }

    /* renamed from: runJSONWithCallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$runCmdsInUI$10(String str, String str2) {
        try {
            String jSONResult = getJSONResult(str);
            if (str2 != null) {
                this.dynamicUI.addJsToWebView(String.format("window.callUICallback('%s',%s);", str2, this.dynamicUI.encodeUtfAndWrapDecode(jSONResult, "ERROR")));
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__runInUIJSON  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__runInUIJSON  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
            if (str2 != null) {
                this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallbackJSON(", str2, ",'failure');"));
            }
        }
    }

    @JavascriptInterface
    @Deprecated
    public void Render(String str, String str2) {
        Log.d("DynamicUI", "Method Android.Render is deprecated. Use Android.render() instead");
        render(str, str2, null);
    }

    @JavascriptInterface
    public void addStoredViewToParent(String str, String str2, int i10, String str3, boolean z10, String str4) {
        addStoredViewToParent(str, str2, i10, str3, z10, str4, null);
    }

    @JavascriptInterface
    public String addToContainerList(int i10, String str) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        return (container == null || !(container.findViewById(i10) instanceof ViewGroup)) ? "__failed" : this.dynamicUI.addToContainerList((ViewGroup) container.findViewById(i10));
    }

    @JavascriptInterface
    public void addViewToParent(String str, String str2, int i10, String str3) {
        addViewToParent(str, str2, i10, str3, (String) null);
    }

    @JavascriptInterface
    public void cancelAnim(String str, String str2) {
        ExecutorManager.runOnMainThread(new e(this, (ObjectAnimator) ((Pair) this.dynamicUI.getRenderer().getInflateView().getStateValFromKey("M_anim_" + str)).second, str2, str, 0));
    }

    @JavascriptInterface
    public void dismissPopUp() {
        this.dynamicUI.getRenderer().dismissPopUp();
    }

    @JavascriptInterface
    public int dpToPx(int i10) {
        if (i10 > 0) {
            return Math.round(i10 * this.dynamicUI.getAppContext().getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    @JavascriptInterface
    public String fetchData(String str) {
        return this.dynamicUI.getAppContext().getSharedPreferences("DUI", 0).getString(str, "null");
    }

    @JavascriptInterface
    public void generateUIElement(String str, int i10, String[] strArr, String str2) {
        generateUIElement(str, i10, strArr, str2, null);
    }

    @JavascriptInterface
    public String getInternalStorageBaseFilePath() {
        return this.dynamicUI.getAppContext().getDir("juspay", 0).getAbsolutePath();
    }

    @JavascriptInterface
    public String getNewID() {
        WeakHashMap weakHashMap = n1.f13788a;
        return String.valueOf(w0.a());
    }

    public Renderer getRenderer() {
        return this.dynamicUI.getRenderer();
    }

    @JavascriptInterface
    public String getScreenDimensions() {
        int i10;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        Rect rect = new Rect();
        try {
            if (this.dynamicUI.getActivity() != null) {
                this.dynamicUI.getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                this.dynamicUI.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                if (Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = this.dynamicUI.getActivity().getWindowManager().getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    i10 = bounds.height();
                } else {
                    this.dynamicUI.getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics2);
                    i10 = displayMetrics2.heightPixels;
                }
            } else {
                displayMetrics = Resources.getSystem().getDisplayMetrics();
                i10 = 0;
            }
            jSONObject.put("width", displayMetrics.widthPixels);
            jSONObject.put("height", displayMetrics.heightPixels);
            jSONObject.put("screenHeight", i10);
            jSONObject2.put("top", rect.top);
            jSONObject2.put("bottom", rect.bottom);
            jSONObject2.put("left", rect.left);
            jSONObject2.put("right", rect.right);
            jSONObject.put("viewportDimensions", jSONObject2);
        } catch (JSONException e10) {
            this.dynamicUI.getLogger().e("JSON_EXCEPTION", e10.toString());
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getState() {
        String str = this.state;
        return str != null ? str : "{}";
    }

    @JavascriptInterface
    public boolean isFilePresent(String str) {
        return new File(str).exists();
    }

    @JavascriptInterface
    public void moveView(String str, String str2) {
        moveView(str, str2, null);
    }

    @JavascriptInterface
    public void prepareAndStoreView(String str, String str2, String str3) {
        try {
            new PreRenderThread(new e(this, str, new JSONObject(str2), str3)).start();
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error while parsing " + str2);
        }
    }

    public void processPendingAddScreen(String str) {
        ExecutorManager.runOnMainThread(new i(0, this, str));
    }

    @JavascriptInterface
    public void removeView(int i10) {
        removeView(i10, null);
    }

    @JavascriptInterface
    public void render(String str, String str2) {
        render(str, str2, "true", null);
    }

    @JavascriptInterface
    public void replaceView(String str, int i10) {
        replaceView(str, i10, null);
    }

    @JavascriptInterface
    public void run(String str, String str2) {
        Renderer renderer;
        Context appContext;
        try {
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            if (this.dynamicUI.getActivity() != null) {
                inflateJSON.setUseAppContext(false);
                renderer = this.dynamicUI.getRenderer();
                appContext = this.dynamicUI.getActivity();
            } else {
                inflateJSON.setUseAppContext(true);
                renderer = this.dynamicUI.getRenderer();
                appContext = this.dynamicUI.getAppContext();
            }
            renderer.parseAndRunPipe(appContext, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, inflateJSON.getUseAppContext());
            if (str2 != null) {
                this.dynamicUI.addJsToWebView("window.callUICallback(" + str2 + ",'success');");
            }
        } catch (Exception e10) {
            String name = e10.getClass().getName();
            this.dynamicUI.getLogger().e("runInUI", name);
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder r10 = da.e.r(name, " - ");
            r10.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onError("runInUI", r10.toString());
            if (str2 != null) {
                this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback(", str2, ",'failure');"));
            }
        }
    }

    @NonNull
    @JavascriptInterface
    public String runCmds(String str) {
        try {
            return getJSONResult(str);
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("ERROR", " excep: fn__runInUIJSON  - " + this.dynamicUI.getRenderer().getErrorDetails());
            this.dynamicUI.getErrorCallback().onException("ERROR", " excep: fn__runInUIJSON  - " + this.dynamicUI.getRenderer().getErrorDetails(), e10);
            return "__failure__";
        }
    }

    @JavascriptInterface
    public void runCmdsInBg(String str, String str2) {
        ExecutorManager.runOnBackgroundThread(new f(0, this, str, str2));
    }

    @JavascriptInterface
    public void runCmdsInUI(String str, String str2) {
        ExecutorManager.runOnMainThread(new f(3, this, str, str2));
    }

    @JavascriptInterface
    public void runInUI(String str, String str2) {
        ExecutorManager.runOnMainThread(new f(1, this, str, str2));
    }

    @JavascriptInterface
    public void saveData(String str, String str2) {
        this.dynamicUI.getAppContext().getSharedPreferences("DUI", 0).edit().putString(str, str2).apply();
    }

    @JavascriptInterface
    public void saveState(String str) {
        this.state = str;
    }

    @JavascriptInterface
    public String setFragmentContainer(int i10, String str) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            return "__failed";
        }
        View findViewById = container.findViewById(i10);
        return findViewById instanceof ViewGroup ? this.dynamicUI.addToContainerList((ViewGroup) findViewById) : "__failed";
    }

    @JavascriptInterface
    public void setImage(int i10, String str, String str2) {
        ExecutorManager.runOnMainThread(new l(this, str2, i10, str, 1));
    }

    public void setPrepareScreenTaskStatus(final String str, final boolean z10) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.c
            @Override // java.lang.Runnable
            public final void run() {
                AndroidInterface.this.lambda$setPrepareScreenTaskStatus$20(z10, str);
            }
        });
    }

    @JavascriptInterface
    public void setState(String str) {
        this.state = str;
    }

    @JavascriptInterface
    @Deprecated
    public void showLoading() {
        Log.d("DynamicUI", "Android.showLoading() method is deprecated. This method does nothing.");
    }

    /* renamed from: showPopup */
    public void lambda$generateUIElement$14(View view, String[] strArr, String str) {
        if (this.dynamicUI.getActivity() == null) {
            this.dynamicUI.getLogger().e("Missing Activity", "showPopup, it is not  activity, it is applicationContext");
            return;
        }
        PopupMenu popupMenu = new PopupMenu(this.dynamicUI.getActivity(), view);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            popupMenu.getMenu().add(0, i10, 0, strArr[i10]);
        }
        popupMenu.setOnMenuItemClickListener(new d(str, 0, this));
        popupMenu.show();
    }

    @JavascriptInterface
    public void startAnim(String str) {
        startAnim(str, null);
    }

    @JavascriptInterface
    public void throwError(String str) {
        this.dynamicUI.getLogger().e("throwError", str);
    }

    @JavascriptInterface
    public void toggleKeyboard(int i10, String str, String str2) {
        if (this.dynamicUI.getActivity() != null) {
            ExecutorManager.runOnMainThread(new l(this, str2, i10, str, 0));
        } else {
            this.dynamicUI.getLogger().e("Missing Activity", "toggleKeyboard, it is not  activity, it is applicationContext");
        }
    }

    @JavascriptInterface
    public void updateAnim(int i10, String str) {
        updateAnim(i10, str, null);
    }

    @JavascriptInterface
    public void updateProperties(String str) {
        updateProperties(str, null);
    }

    @JavascriptInterface
    @Deprecated
    public void Render(String str, String str2, String str3) {
        Log.d("DynamicUI", "Method Android.Render is deprecated. Use Android.render() instead");
        render(str, str2, str3, null);
    }

    @JavascriptInterface
    public void addStoredViewToParent(final String str, final String str2, final int i10, final String str3, final boolean z10, final String str4, final String str5) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.h
            @Override // java.lang.Runnable
            public final void run() {
                AndroidInterface.this.lambda$addStoredViewToParent$3(str2, str, i10, str3, z10, str4, str5);
            }
        });
    }

    @JavascriptInterface
    public void addViewToParent(String str, String str2, int i10, String str3, String str4) {
        addViewToParent(str, str2, i10, str3, false, str4);
    }

    @JavascriptInterface
    public void generateUIElement(final String str, final int i10, final String[] strArr, final String str2, final String str3) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.k
            @Override // java.lang.Runnable
            public final void run() {
                AndroidInterface.this.lambda$generateUIElement$15(str3, str, i10, strArr, str2);
            }
        });
    }

    @JavascriptInterface
    public void moveView(String str, String str2, String str3) {
        ExecutorManager.runOnMainThread(new e((Object) this, str3, str, (Object) str2, 2));
    }

    @JavascriptInterface
    public void removeView(int i10, String str) {
        ExecutorManager.runOnMainThread(new m(this, str, i10));
    }

    @JavascriptInterface
    public void render(String str, String str2, String str3) {
        render(str, str2, str3, null);
    }

    @JavascriptInterface
    public void replaceView(String str, int i10, String str2) {
        try {
            ExecutorManager.runOnMainThread(new j(this, str2, new JSONObject(str), i10));
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSON_ERROR", "fn__replaceView - " + this.dynamicUI.getRenderer().getErrorDetails() + " - " + str);
        }
    }

    @JavascriptInterface
    public void runInUI(String str, String str2, String str3, String str4) {
        ExecutorManager.runOnMainThread(new a(this, str, str3, str4, str2, 0));
    }

    @JavascriptInterface
    public void startAnim(String str, String str2) {
        ExecutorManager.runOnMainThread(new e(this, this.dynamicUI.getRenderer().getInflateView().findAnimationById(str), str2, str, 1));
    }

    @JavascriptInterface
    public void updateAnim(int i10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            ExecutorManager.runOnMainThread(new j(this, str2, i10, jSONArray));
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error parsing json for animation string " + str);
        }
    }

    @JavascriptInterface
    public void updateProperties(String str, String str2) {
        ExecutorManager.runOnMainThread(new f(2, this, str2, str));
    }

    @JavascriptInterface
    public void addViewToParent(String str, String str2, int i10, String str3, boolean z10) {
        addViewToParent(str, str2, i10, str3, z10, null);
    }

    @JavascriptInterface
    public void render(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.dynamicUI.getContainer(str4) != null) {
                ExecutorManager.runOnMainThread(new a(this, jSONObject, str4, str3, str2));
            } else {
                this.dynamicUI.getLogger().e("missing_container", "render, it is not activity, it is applicationContext/ no container");
                this.dynamicUI.getErrorCallback().onError("ERROR", " excep: fn__Render  - missing_container - " + this.dynamicUI.getRenderer().getErrorDetails());
                if (str2 != null) {
                    this.dynamicUI.addJsToWebView("window.callUICallback(" + str2 + ",'failure');");
                }
            }
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "fn__render - " + this.dynamicUI.getRenderer().getErrorDetails() + " - " + str);
        }
    }

    @JavascriptInterface
    public void addViewToParent(final String str, String str2, final int i10, final String str3, final boolean z10, final String str4) {
        try {
            final JSONObject jSONObject = new JSONObject(str2);
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.g
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidInterface.this.lambda$addViewToParent$1(str, jSONObject, i10, z10, str4, str3);
                }
            });
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error while parsing " + str2);
        }
    }
}
