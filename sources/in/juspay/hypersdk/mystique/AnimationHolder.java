package in.juspay.hypersdk.mystique;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import in.juspay.hypersdk.core.DuiCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.g;

/* loaded from: classes2.dex */
public class AnimationHolder {
    private static final String NAME = "name";
    private final WeakHashMap<View, HashMap<String, InlineAnimation>> animatorHashMap = new WeakHashMap<>();
    private final WeakHashMap<View, CallbackHolder> callbackHashMap = new WeakHashMap<>();
    private final float density;
    private final DuiCallback duiCallback;

    /* loaded from: classes2.dex */
    public class CallbackHolder {
        private static final String ON_ANIMATION_END = "onAnimationEnd";
        private static final String ON_ANIMATION_START = "onAnimationStart";
        private static final String ON_ANIMATION_UPDATE = "onAnimationUpdate";
        private String onEnd;
        private String onStart;
        private String onUpdate;

        public CallbackHolder() {
        }

        public String getOnEnd() {
            return this.onEnd;
        }

        public String getOnStart() {
            return this.onStart;
        }

        public String getOnUpdate() {
            return this.onUpdate;
        }

        public void updateCallbacks(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.onEnd = AnimationHolder.this.getString(jSONObject, ON_ANIMATION_END, this.onEnd);
            this.onStart = AnimationHolder.this.getString(jSONObject, ON_ANIMATION_START, this.onStart);
            this.onUpdate = AnimationHolder.this.getString(jSONObject, ON_ANIMATION_UPDATE, this.onUpdate);
        }
    }

    /* loaded from: classes2.dex */
    public class InlineAnimation {
        private static final String DELAY = "delay";
        private static final String DURATION = "duration";
        private static final String FROM_ALPHA = "fromAlpha";
        private static final String FROM_ROTATION = "fromRotation";
        private static final String FROM_ROTATION_X = "fromRotationX";
        private static final String FROM_ROTATION_Y = "fromRotationY";
        private static final String FROM_SCALE_X = "fromScaleX";
        private static final String FROM_SCALE_Y = "fromScaleY";
        private static final String FROM_X = "fromX";
        private static final String FROM_Y = "fromY";
        private static final String INTERPOLATOR = "interpolator";
        private static final String REPEAT_COUNT = "repeatCount";
        private static final String REPEAT_MODE = "repeatMode";
        private static final String TAG = "tag";
        private static final String TO_ALPHA = "toAlpha";
        private static final String TO_ROTATION = "toRotation";
        private static final String TO_ROTATION_X = "toRotationX";
        private static final String TO_ROTATION_Y = "toRotationY";
        private static final String TO_SCALE_X = "toScaleX";
        private static final String TO_SCALE_Y = "toScaleY";
        private static final String TO_X = "toX";
        private static final String TO_Y = "toY";
        private ObjectAnimator animator;
        private ArrayList<PropertyValuesHolder> holders = new ArrayList<>();
        private JSONObject newProperties;
        private JSONObject properties;
        private final WeakReference<View> viewRef;

        public InlineAnimation(JSONObject jSONObject, View view) {
            this.viewRef = new WeakReference<>(view);
            this.properties = jSONObject;
        }

        private void createAnimator() {
            if (this.viewRef.get() == null) {
                return;
            }
            View view = this.viewRef.get();
            this.holders = new ArrayList<>();
            ObjectAnimator objectAnimator = new ObjectAnimator();
            this.animator = objectAnimator;
            objectAnimator.setTarget(view);
            this.animator.setInterpolator(getInterpolator());
            this.animator.setDuration((int) AnimationHolder.this.getFloat(this.properties, DURATION, g.f34069a, 1.0f));
            this.animator.setStartDelay((int) AnimationHolder.this.getFloat(this.properties, DELAY, g.f34069a, 1.0f));
            this.animator.setRepeatCount((int) AnimationHolder.this.getFloat(this.properties, REPEAT_COUNT, g.f34069a, 1.0f));
            if (this.properties.has(REPEAT_MODE)) {
                this.animator.setRepeatMode("reverse".equals(AnimationHolder.this.getString(this.properties, REPEAT_MODE, null)) ? 2 : 1);
            }
            createPropertyHolder(View.ALPHA, view.getAlpha(), FROM_ALPHA, TO_ALPHA);
            createPropertyHolder(View.ROTATION, view.getRotation(), FROM_ROTATION, TO_ROTATION);
            createPropertyHolder(View.ROTATION_X, view.getRotationX(), FROM_ROTATION_X, TO_ROTATION_X);
            createPropertyHolder(View.ROTATION_Y, view.getRotationY(), FROM_ROTATION_Y, TO_ROTATION_Y);
            createPropertyHolder(View.SCALE_X, view.getScaleX(), FROM_SCALE_X, TO_SCALE_X);
            createPropertyHolder(View.SCALE_Y, view.getScaleY(), FROM_SCALE_Y, TO_SCALE_Y);
            createPropertyHolder(View.TRANSLATION_X, view.getTranslationX(), FROM_X, TO_X);
            createPropertyHolder(View.TRANSLATION_Y, view.getTranslationY(), FROM_Y, TO_Y);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.holders.size()];
            for (int i10 = 0; i10 < this.holders.size(); i10++) {
                propertyValuesHolderArr[i10] = this.holders.get(i10);
            }
            this.animator.setValues(propertyValuesHolderArr);
        }

        private void createPropertyHolder(Property<View, Float> property, float f10, String... strArr) {
            if (AnimationHolder.this.hasOneKeyAtleast(this.properties, strArr)) {
                float f11 = (property == View.TRANSLATION_Y || property == View.TRANSLATION_X) ? AnimationHolder.this.density : 1.0f;
                float[] fArr = new float[strArr.length];
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    fArr[i10] = AnimationHolder.this.getFloat(this.properties, strArr[i10], f10, f11);
                }
                this.holders.add(PropertyValuesHolder.ofFloat(property, fArr));
            }
        }

        private Interpolator getInterpolator() {
            String string = AnimationHolder.this.getString(this.properties, INTERPOLATOR, "linear");
            string.getClass();
            char c10 = 65535;
            switch (string.hashCode()) {
                case -1965056864:
                    if (string.equals("easeout")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1383205240:
                    if (string.equals("bounce")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1310315117:
                    if (string.equals("easein")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1360213211:
                    if (string.equals("easeinout")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new DecelerateInterpolator();
                case 1:
                    return new BounceInterpolator();
                case 2:
                    return new AccelerateInterpolator();
                case 3:
                    return new AccelerateDecelerateInterpolator();
                default:
                    if (!string.contains(",")) {
                        return new LinearInterpolator();
                    }
                    String[] split = string.split(",");
                    float[] fArr = {g.f34069a, g.f34069a, g.f34069a, g.f34069a};
                    for (int i10 = 0; i10 < split.length; i10++) {
                        fArr[i10] = Float.parseFloat(split[i10]);
                    }
                    return new PathInterpolator(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
        }

        private boolean isSame(JSONObject jSONObject) {
            ArrayList jSONKeys = AnimationHolder.this.getJSONKeys(this.properties);
            for (String str : AnimationHolder.this.getJSONKeys(jSONObject)) {
                if (!jSONKeys.contains(str) || !AnimationHolder.this.getString(this.properties, str, HttpUrl.FRAGMENT_ENCODE_SET).equals(AnimationHolder.this.getString(jSONObject, str, null))) {
                    return false;
                }
                jSONKeys.remove(str);
            }
            return jSONKeys.size() == 0;
        }

        private void resetAnimation() {
            resetProperty(View.ALPHA, 1.0f, FROM_ALPHA, TO_ALPHA);
            resetProperty(View.ROTATION, g.f34069a, FROM_ROTATION, TO_ROTATION);
            resetProperty(View.ROTATION_X, g.f34069a, FROM_ROTATION_X, TO_ROTATION_X);
            resetProperty(View.ROTATION_Y, g.f34069a, FROM_ROTATION_Y, TO_ROTATION_Y);
            resetProperty(View.SCALE_X, 1.0f, FROM_SCALE_X, TO_SCALE_X);
            resetProperty(View.SCALE_Y, 1.0f, FROM_SCALE_Y, TO_SCALE_Y);
            resetProperty(View.TRANSLATION_X, g.f34069a, FROM_X, TO_X);
            resetProperty(View.TRANSLATION_Y, g.f34069a, FROM_Y, TO_Y);
        }

        private void resetProperty(Property<View, Float> property, float f10, String... strArr) {
            if (AnimationHolder.this.hasOneKeyAtleast(this.properties, strArr)) {
                JSONObject jSONObject = this.newProperties;
                if (jSONObject == null || !AnimationHolder.this.hasOneKeyAtleast(jSONObject, strArr)) {
                    property.set(this.viewRef.get(), Float.valueOf(f10));
                }
            }
        }

        private void setEventListeners() {
            final CallbackHolder callbackHolder;
            if (AnimationHolder.this.duiCallback == null || (callbackHolder = (CallbackHolder) AnimationHolder.this.callbackHashMap.get(this.viewRef.get())) == null) {
                return;
            }
            if (callbackHolder.getOnEnd() == null && callbackHolder.getOnStart() == null) {
                return;
            }
            this.animator.addListener(new Animator.AnimatorListener() { // from class: in.juspay.hypersdk.mystique.AnimationHolder.InlineAnimation.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NonNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NonNull Animator animator) {
                    if (callbackHolder.getOnEnd() != null) {
                        AnimationHolder.this.duiCallback.addJsToWebView("window.callUICallback('" + callbackHolder.getOnEnd() + "','" + InlineAnimation.this.getTag() + "');");
                    }
                    animator.removeListener(this);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NonNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NonNull Animator animator) {
                    if (callbackHolder.getOnStart() != null) {
                        AnimationHolder.this.duiCallback.addJsToWebView("window.callUICallback('" + callbackHolder.getOnStart() + "','" + InlineAnimation.this.getTag() + "');");
                    }
                }
            });
        }

        public String getName() {
            return AnimationHolder.this.getString(this.properties, "name", HttpUrl.FRAGMENT_ENCODE_SET);
        }

        public String getTag() {
            return AnimationHolder.this.getString(this.properties, TAG, "untagged");
        }

        public void remove() {
            stop();
            resetAnimation();
        }

        public void start() {
            createAnimator();
            setEventListeners();
            this.animator.start();
        }

        public void stop() {
            if (this.animator.isRunning()) {
                this.animator.cancel();
            }
        }

        public void update(JSONObject jSONObject, Boolean bool) {
            if (bool.booleanValue() || !isSame(jSONObject)) {
                stop();
                this.newProperties = jSONObject;
                resetAnimation();
                this.newProperties = null;
                this.properties = jSONObject;
                start();
            }
        }
    }

    public AnimationHolder(DuiCallback duiCallback, float f10) {
        this.density = f10;
        this.duiCallback = duiCallback;
    }

    private void assertView(Object obj) {
        if (!(obj instanceof View)) {
            throw new Error("Instance object is not a view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFloat(JSONObject jSONObject, String str, float f10, float f11) {
        try {
            return (float) (f11 * jSONObject.getDouble(str));
        } catch (JSONException unused) {
            return f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<String> getJSONKeys(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        ArrayList<String> arrayList = new ArrayList<>();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        return arrayList;
    }

    private JSONObject getJSONObject(JSONArray jSONArray, int i10) {
        try {
            return jSONArray.getJSONObject(i10);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getString(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasOneKeyAtleast(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                return true;
            }
        }
        return false;
    }

    private void setupAnimation(View view, JSONArray jSONArray, Boolean bool) {
        InlineAnimation inlineAnimation;
        HashMap<String, InlineAnimation> hashMap = this.animatorHashMap.get(view);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.animatorHashMap.put(view, hashMap);
        }
        HashMap hashMap2 = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = getJSONObject(jSONArray, i10);
            if (jSONObject != null) {
                String string = getString(jSONObject, "name", HttpUrl.FRAGMENT_ENCODE_SET);
                if (!hashMap.containsKey(string) || (inlineAnimation = hashMap.get(string)) == null) {
                    startNewAnimation(view, jSONObject, hashMap, string);
                } else {
                    inlineAnimation.update(jSONObject, bool);
                }
                hashMap2.put(string, Boolean.TRUE);
            }
        }
        Iterator it = new ArrayList(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!hashMap2.containsKey(str)) {
                InlineAnimation inlineAnimation2 = hashMap.get(str);
                if (inlineAnimation2 != null) {
                    inlineAnimation2.remove();
                }
                hashMap.remove(str);
            }
        }
    }

    private void startNewAnimation(View view, JSONObject jSONObject, HashMap<String, InlineAnimation> hashMap, String str) {
        InlineAnimation inlineAnimation = new InlineAnimation(jSONObject, view);
        inlineAnimation.start();
        hashMap.put(str, inlineAnimation);
    }

    private Boolean toResetAnimation(JSONObject jSONObject) {
        if (!jSONObject.has("resetAnimation")) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean("resetAnimation"));
        } catch (JSONException unused) {
            return Boolean.FALSE;
        }
    }

    private void updateViewCallbacks(View view, JSONObject jSONObject) {
        CallbackHolder callbackHolder = this.callbackHashMap.get(view);
        if (callbackHolder == null) {
            callbackHolder = new CallbackHolder();
        }
        callbackHolder.updateCallbacks(jSONObject);
        this.callbackHashMap.put(view, callbackHolder);
    }

    public void applyAnimation(Object obj, JSONArray jSONArray, JSONObject jSONObject) {
        if (obj instanceof View) {
            assertView(obj);
            View view = (View) obj;
            updateViewCallbacks(view, jSONObject);
            setupAnimation(view, jSONArray, toResetAnimation(jSONObject));
        }
    }
}
