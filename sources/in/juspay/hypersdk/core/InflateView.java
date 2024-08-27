package in.juspay.hypersdk.core;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyperlottie.LottieAnimation;
import in.juspay.hypersdk.mystique.AccordionLayout;
import in.juspay.hypersdk.mystique.AnimationHolder;
import in.juspay.hypersdk.mystique.BottomSheetLayout;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.mystique.SwypeLayout;
import in.juspay.hypersdk.mystique.SwypeScroll;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class InflateView {
    private static final String ARG_TYPE_SPLIT = "_";
    private static final Pattern COMMAND_SPLIT;
    private static final String FUNCTION_ARG_SPLIT = ",";
    private static final Pattern FUNCTION_ARG_SPLIT_ESCAPE;
    private static final String FUNCTION_ARG_START = ":";
    private static final String KEYWORD_SPLIT = "->";
    private static final String LOG_TAG = "in.juspay.hypersdk.core.InflateView";
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TYPES;
    private static final String SETTER_EQUALS = "=";

    @NonNull
    private final AnimationHolder animationHolder;

    @NonNull
    private final DuiCallback duiCallback;

    @NonNull
    protected final DynamicUI dynamicUI;
    private LottieAnimation lottieAnimation;
    private PopupMenu popUpMenu;
    private float swipeEndX;
    private float swipeEndY;
    private float swipeStartX;
    private float swipeStartY;

    @NonNull
    private final HashMap<Cmd, Method> functionCache = new HashMap<>();

    @NonNull
    protected HashMap<String, Object> state = new HashMap<>();
    private String currViewId = "-1";
    private String lastCommand = HttpUrl.FRAGMENT_ENCODE_SET;
    private String currView = HttpUrl.FRAGMENT_ENCODE_SET;
    private String fileOrigin = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean useAppContext = false;

    /* renamed from: in.juspay.hypersdk.core.InflateView$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements DuiCallback {
        final /* synthetic */ DynamicUI val$dynamicUI;

        public AnonymousClass1(DynamicUI dynamicUI) {
            r2 = dynamicUI;
        }

        @Override // in.juspay.hyper.core.JsCallback
        public void addJsToWebView(String str) {
            r2.addJsToWebView(str);
        }

        @Override // in.juspay.hypersdk.core.DuiCallback
        public InflateView getInflateView() {
            return r2.getInflateView();
        }

        @Override // in.juspay.hypersdk.core.DuiCallback
        public DuiLogger getLogger() {
            return r2.getLogger();
        }
    }

    /* renamed from: in.juspay.hypersdk.core.InflateView$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements TextureView.SurfaceTextureListener {
        private boolean isDrawn = false;
        final /* synthetic */ Context val$context;
        final /* synthetic */ MediaPlayer val$mMediaPlayer;
        final /* synthetic */ JSONObject val$properties;
        final /* synthetic */ Uri val$uri;

        public AnonymousClass2(MediaPlayer mediaPlayer, Context context, Uri uri, JSONObject jSONObject) {
            this.val$mMediaPlayer = mediaPlayer;
            this.val$context = context;
            this.val$uri = uri;
            this.val$properties = jSONObject;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i10, int i11) {
            if (this.isDrawn) {
                return;
            }
            try {
                this.isDrawn = true;
                this.val$mMediaPlayer.reset();
                this.val$mMediaPlayer.setDataSource(this.val$context, this.val$uri);
                this.val$mMediaPlayer.setSurface(new Surface(surfaceTexture));
                this.val$mMediaPlayer.prepareAsync();
                if (this.val$properties.optBoolean("autoloop", false)) {
                    this.val$mMediaPlayer.setLooping(true);
                }
                final MediaPlayer mediaPlayer = this.val$mMediaPlayer;
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: in.juspay.hypersdk.core.c0
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer2) {
                        mediaPlayer.start();
                    }
                });
            } catch (Exception e10) {
                InflateView.this.dynamicUI.getLogger().e("TextureView", "Exception in TextureView: " + e10);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            try {
                this.val$mMediaPlayer.stop();
                this.val$mMediaPlayer.release();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i10, int i11) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: in.juspay.hypersdk.core.InflateView$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements View.OnTouchListener {
        final /* synthetic */ String val$jsFunc;

        public AnonymousClass3(String str) {
            r2 = str;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            InflateView.this.dynamicUI.addJsToWebView("window.callUICallback('" + r2 + "','" + motionEvent.getX() + "','" + motionEvent.getY() + "');");
            return false;
        }
    }

    /* renamed from: in.juspay.hypersdk.core.InflateView$4 */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements View.OnTouchListener {
        final /* synthetic */ String val$jsFunc;

        public AnonymousClass4(String str) {
            r2 = str;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            String str;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    InflateView.this.swipeEndX = motionEvent.getX();
                    InflateView.this.swipeEndY = motionEvent.getY();
                    float degrees = (float) Math.toDegrees(Math.atan2(InflateView.this.swipeEndY - InflateView.this.swipeStartY, InflateView.this.swipeEndX - InflateView.this.swipeStartX));
                    if (degrees < s0.g.f34069a) {
                        degrees += 360.0f;
                    }
                    if ((degrees >= 45.0f && degrees <= 135.0f) || (degrees >= 225.0f && degrees <= 315.0f)) {
                        if (InflateView.this.swipeEndY - InflateView.this.swipeStartY > 100.0f) {
                            str = "2";
                        } else if (InflateView.this.swipeStartY - InflateView.this.swipeEndY > 100.0f) {
                            str = "-2";
                        }
                    } else if (InflateView.this.swipeEndX - InflateView.this.swipeStartX > 100.0f) {
                        str = "1";
                    } else if (InflateView.this.swipeStartX - InflateView.this.swipeEndX > 100.0f) {
                        str = "-1";
                    }
                    InflateView.this.dynamicUI.addJsToWebView(a3.a.k(new StringBuilder("window.callUICallback('"), r2, "','", str, "');"));
                    return true;
                }
            } else {
                InflateView.this.swipeStartX = motionEvent.getX();
                InflateView.this.swipeStartY = motionEvent.getY();
            }
            str = "0";
            InflateView.this.dynamicUI.addJsToWebView(a3.a.k(new StringBuilder("window.callUICallback('"), r2, "','", str, "');"));
            return true;
        }
    }

    /* renamed from: in.juspay.hypersdk.core.InflateView$5 */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ String val$jsFunc;

        public AnonymousClass5(String str) {
            r2 = str;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            StringBuilder sb2 = new StringBuilder("window.callUICallback('");
            sb2.append(r2);
            sb2.append("', 'PROGRESS_CHANGED', '");
            sb2.append(i10);
            sb2.append("','");
            InflateView.this.dynamicUI.addJsToWebView(da.e.o(sb2, z10, "');"));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            InflateView.this.dynamicUI.addJsToWebView(nn.d.o(new StringBuilder("window.callUICallback('"), r2, "', 'START_TRACKING_TOUCH');"));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            InflateView.this.dynamicUI.addJsToWebView(nn.d.o(new StringBuilder("window.callUICallback('"), r2, "', 'STOP_TRACKING_TOUCH');"));
        }
    }

    /* renamed from: in.juspay.hypersdk.core.InflateView$6 */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements Animator.AnimatorListener {
        final /* synthetic */ String val$finalOnEndId;
        final /* synthetic */ ObjectAnimator val$objAnim;

        public AnonymousClass6(String str, ObjectAnimator objectAnimator) {
            r2 = str;
            r3 = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            ObjectAnimator objectAnimator;
            if (!InflateView.this.state.containsKey(r2) || (objectAnimator = (ObjectAnimator) ((Pair) InflateView.this.state.get(r2)).second) == null || objectAnimator == r3) {
                return;
            }
            objectAnimator.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* renamed from: in.juspay.hypersdk.core.InflateView$7 */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements TextWatcher {
        private String previousText;
        final /* synthetic */ String val$js;

        public AnonymousClass7(String str) {
            r2 = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.previousText = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.previousText.equals(charSequence.toString())) {
                return;
            }
            InflateView.this.dynamicUI.addJsToWebView("window.callUICallback('" + r2 + "', '" + ((Object) charSequence) + "');");
        }
    }

    /* renamed from: in.juspay.hypersdk.core.InflateView$8 */
    /* loaded from: classes2.dex */
    public class AnonymousClass8 implements TextWatcher {
        private static final int TOTAL_DIGITS = 21;
        private static final int TOTAL_SYMBOLS = 26;
        private final char DIVIDER;
        private final int DIVIDER_MODULO;
        private final int DIVIDER_POSITION;
        private boolean executeTextChange;
        private String previousText;
        final /* synthetic */ EditText val$cardField;
        final /* synthetic */ String val$js;
        final /* synthetic */ JSONObject val$properties;

        public AnonymousClass8(JSONObject jSONObject, String str, EditText editText) {
            this.val$properties = jSONObject;
            this.val$js = str;
            this.val$cardField = editText;
            int i10 = jSONObject.getInt("separatorRepeat");
            this.DIVIDER_POSITION = i10;
            this.DIVIDER_MODULO = i10 + 1;
            this.DIVIDER = jSONObject.getString("separator").charAt(0);
            this.executeTextChange = true;
        }

        private String buildCorrectString(char[] cArr, int i10) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < cArr.length; i11++) {
                char c10 = cArr[i11];
                if (c10 != 0) {
                    sb2.append(c10);
                    if (i11 > 0 && i11 < i10 - 1 && (i11 + 1) % this.DIVIDER_POSITION == 0) {
                        sb2.append(this.DIVIDER);
                    }
                }
            }
            return sb2.toString();
        }

        private char[] getDigitArray(Editable editable) {
            char[] cArr = new char[21];
            int i10 = 0;
            for (int i11 = 0; i11 < editable.length() && i10 < 21; i11++) {
                char charAt = editable.charAt(i11);
                if (Character.isDigit(charAt)) {
                    cArr[i10] = charAt;
                    i10++;
                }
            }
            return cArr;
        }

        private boolean isInputCorrect(Editable editable) {
            boolean z10 = editable.length() <= 26;
            int i10 = 0;
            while (i10 < editable.length()) {
                z10 &= (i10 <= 0 || (i10 + 1) % this.DIVIDER_MODULO != 0) ? Character.isDigit(editable.charAt(i10)) : this.DIVIDER == editable.charAt(i10);
                i10++;
            }
            return z10;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() != 0 && this.val$cardField.isFocused() && !this.previousText.equals(editable.toString()) && this.executeTextChange) {
                boolean z10 = this.previousText.length() > editable.length();
                InputFilter[] filters = editable.getFilters();
                editable.setFilters(new InputFilter[0]);
                int selectionStart = this.val$cardField.getSelectionStart();
                this.executeTextChange = false;
                int i10 = selectionStart + 1;
                if (i10 % this.DIVIDER_MODULO == 0 && z10) {
                    editable.delete(selectionStart - 1, selectionStart);
                }
                if (!isInputCorrect(editable)) {
                    editable.replace(0, editable.length(), buildCorrectString(getDigitArray(editable), editable.length()));
                    if (editable.length() > 0 && this.DIVIDER == editable.charAt(editable.length() - 1) && z10) {
                        editable.delete(editable.length() - 1, editable.length());
                    }
                }
                if (selectionStart != 0 && selectionStart % this.DIVIDER_MODULO == 0 && editable.length() > selectionStart && !z10) {
                    this.val$cardField.setSelection(i10);
                }
                this.executeTextChange = true;
                editable.setFilters(filters);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.previousText = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.previousText.equals(charSequence.toString()) || !this.executeTextChange) {
                return;
            }
            InflateView.this.dynamicUI.addJsToWebView("window.callUICallback('" + this.val$js + "', '" + ((Object) charSequence) + "');");
        }
    }

    /* loaded from: classes2.dex */
    public static class Cmd {
        private final Class<?>[] args;
        private final Class<?> clazz;
        private final String functionName;

        public Cmd(Class<?> cls, String str, Class<?>[] clsArr) {
            this.clazz = cls;
            this.functionName = str;
            this.args = clsArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Cmd cmd = (Cmd) obj;
            if (this.clazz.equals(cmd.clazz) && this.functionName.equals(cmd.functionName)) {
                return Arrays.equals(this.args, cmd.args);
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int g10 = jr.h.g(this.functionName, this.clazz.hashCode() * 31, 31);
            Class<?>[] clsArr = this.args;
            if (clsArr != null) {
                i10 = Arrays.hashCode(clsArr);
            } else {
                i10 = 0;
            }
            return g10 + i10;
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        PRIMITIVE_TYPES = hashtable;
        FUNCTION_ARG_SPLIT_ESCAPE = Pattern.compile("(?<!\\\\)" + Pattern.quote(FUNCTION_ARG_SPLIT));
        COMMAND_SPLIT = Pattern.compile("(?<!\\\\)" + Pattern.quote(";"));
        hashtable.put(Boolean.class, Boolean.TYPE);
        hashtable.put(Character.class, Character.TYPE);
        hashtable.put(Byte.class, Byte.TYPE);
        hashtable.put(Short.class, Short.TYPE);
        hashtable.put(Integer.class, Integer.TYPE);
        hashtable.put(Long.class, Long.TYPE);
        hashtable.put(Float.class, Float.TYPE);
        hashtable.put(Double.class, Double.TYPE);
        hashtable.put(Void.class, Void.TYPE);
    }

    public InflateView(@NonNull DynamicUI dynamicUI) {
        this.lottieAnimation = null;
        this.dynamicUI = dynamicUI;
        AnonymousClass1 anonymousClass1 = new DuiCallback() { // from class: in.juspay.hypersdk.core.InflateView.1
            final /* synthetic */ DynamicUI val$dynamicUI;

            public AnonymousClass1(DynamicUI dynamicUI2) {
                r2 = dynamicUI2;
            }

            @Override // in.juspay.hyper.core.JsCallback
            public void addJsToWebView(String str) {
                r2.addJsToWebView(str);
            }

            @Override // in.juspay.hypersdk.core.DuiCallback
            public InflateView getInflateView() {
                return r2.getInflateView();
            }

            @Override // in.juspay.hypersdk.core.DuiCallback
            public DuiLogger getLogger() {
                return r2.getLogger();
            }
        };
        this.duiCallback = anonymousClass1;
        this.state.put("duiObj", dynamicUI2);
        this.animationHolder = new AnimationHolder(anonymousClass1, dynamicUI2.getAppContext().getResources().getDisplayMetrics().density);
        if (PaymentUtils.isClassAvailable("in.juspay.hyperlottie.LottieAnimation")) {
            this.lottieAnimation = new LottieAnimation(dynamicUI2.getAppContext(), dynamicUI2, dynamicUI2.getBridgeComponents().getFileProviderInterface());
        }
    }

    private Object findAndSetField(Object obj, String str, String str2, boolean z10) {
        Field field;
        try {
            field = obj.getClass().getField(str);
        } catch (NoSuchFieldException unused) {
            Field field2 = null;
            for (Field field3 : obj.getClass().getFields()) {
                if (field3.getName().equals(str)) {
                    field2 = field3;
                }
            }
            field = field2;
        }
        if (field != null) {
            field.set(obj, getValue(str2, z10));
        } else {
            this.dynamicUI.getLogger().d(LOG_TAG, "Couldn't set field for " + str);
        }
        return obj;
    }

    private Method findMethodInClass(Class<?> cls, String str) {
        String str2;
        String str3;
        if (cls == null) {
            return null;
        }
        if (indexOf(str, FUNCTION_ARG_START, 0) != -1) {
            String[] substr = substr(str, FUNCTION_ARG_START);
            str2 = substr[0];
            str3 = substr[1];
        } else {
            str2 = str;
            str3 = null;
        }
        return findMethodWithCmd(new Cmd(cls, str2, str3 != null ? parseTypeArguments(str3) : null));
    }

    private ObjectAnimator getAnimator(Object obj, PropertyValuesHolder[] propertyValuesHolderArr, JSONObject jSONObject) {
        boolean has = jSONObject.has("duration");
        float f10 = s0.g.f34069a;
        float f11 = has ? (float) jSONObject.getDouble("duration") : 0.0f;
        if (jSONObject.has("delay")) {
            f10 = (float) jSONObject.getDouble("delay");
        }
        boolean z10 = false;
        int i10 = jSONObject.has("repeatCount") ? jSONObject.getInt("repeatCount") : 0;
        if (jSONObject.has("startImmediate") && jSONObject.getBoolean("startImmediate")) {
            z10 = true;
        }
        String string = jSONObject.has("easing") ? jSONObject.getString("easing") : "linear";
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(f11);
        ofPropertyValuesHolder.setStartDelay(f10);
        ofPropertyValuesHolder.setRepeatCount(i10);
        ofPropertyValuesHolder.setInterpolator(getEasing(string));
        if (z10) {
            ofPropertyValuesHolder.start();
        }
        return ofPropertyValuesHolder;
    }

    private int getArgsLength(String str) {
        return FUNCTION_ARG_SPLIT_ESCAPE.split(str).length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b4, code lost:
    
        if (r4.equals("strget") == false) goto L97;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00ba. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <Any> Any getClassType(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.getClassType(java.lang.String):java.lang.Object");
    }

    private Context getContext() {
        return this.useAppContext ? this.dynamicUI.getAppContext() : this.dynamicUI.getActivity();
    }

    private TimeInterpolator getCustomEasing(String str, final float[] fArr) {
        str.getClass();
        return !str.equals("bezier") ? !str.equals("spring") ? new LinearInterpolator() : new TimeInterpolator() { // from class: in.juspay.hypersdk.core.r
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float lambda$getCustomEasing$10;
                lambda$getCustomEasing$10 = InflateView.lambda$getCustomEasing$10(fArr, f10);
                return lambda$getCustomEasing$10;
            }
        } : new PathInterpolator(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    private TimeInterpolator getEasing(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1383205240:
                if (str.equals("bounce")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c10 = 2;
                    break;
                }
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c10 = 3;
                    break;
                }
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new AccelerateInterpolator();
            case 1:
                return new BounceInterpolator();
            case 2:
                return new LinearInterpolator();
            case 3:
                return new DecelerateInterpolator();
            case 4:
                return new AccelerateDecelerateInterpolator();
            default:
                try {
                    if (str.contains("[")) {
                        String substring = str.substring(0, str.indexOf("["));
                        JSONArray jSONArray = new JSONArray(str.substring(str.indexOf("[")));
                        int length = jSONArray.length();
                        float[] fArr = new float[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            fArr[i10] = (float) jSONArray.getDouble(i10);
                        }
                        return getCustomEasing(substring, fArr);
                    }
                } catch (JSONException unused) {
                }
                return new LinearInterpolator();
        }
    }

    private <Any> Any getValue(String str, boolean z10) {
        if (str == null) {
            this.dynamicUI.getLogger().e("WARNING", " isNull : fn__getValue - value " + getErrorDetails());
            this.dynamicUI.getErrorCallback().onError("WARNING", " isNull : fn__getValue - value " + getErrorDetails());
            return null;
        }
        this.dynamicUI.getLogger().d("getValue!", str);
        String[] substr = substr(str, ARG_TYPE_SPLIT);
        String str2 = substr[0];
        String str3 = substr[1];
        if (str3.indexOf(92) != -1 && str3.contains(";")) {
            str3 = str3.replace("\\\\;", ";");
        }
        if (str3.indexOf(92) != -1 && str3.contains(ARG_TYPE_SPLIT)) {
            str3 = str3.replace("\\\\_", ARG_TYPE_SPLIT);
        }
        if (str3.indexOf(92) != -1 && str3.contains(FUNCTION_ARG_START)) {
            str3 = str3.replace("\\\\:", FUNCTION_ARG_START);
        }
        if (str3.indexOf(92) != -1 && str3.contains(FUNCTION_ARG_SPLIT)) {
            str3 = str3.replace("\\\\,", FUNCTION_ARG_SPLIT);
        }
        if (str3.indexOf(92) != -1 && str3.contains(SETTER_EQUALS)) {
            str3 = str3.replace("\\\\=", SETTER_EQUALS);
        }
        return (Any) getValueNew(str2, str3);
    }

    private int indexOf(String str, String str2, int i10) {
        int indexOf = str.substring(i10).indexOf(str2);
        if (indexOf != -1 && indexOf != 0 && indexOf < str.length()) {
            int i11 = indexOf + i10;
            if (str.charAt(i11 - 1) == '\\') {
                return indexOf(str, str2, str2.length() + i11);
            }
        }
        return indexOf == -1 ? indexOf : indexOf + i10;
    }

    public static boolean isWrappedPrimitiveType(Class<?> cls) {
        return PRIMITIVE_TYPES.containsKey(cls);
    }

    public /* synthetic */ void lambda$dismissPopUp$11() {
        PopupMenu popupMenu = this.popUpMenu;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    public static /* synthetic */ float lambda$getCustomEasing$10(float[] fArr, float f10) {
        return ((float) (Math.sin((6.283185307179586d / fArr[0]) * (f10 - (r6 / 4.0f))) * Math.pow(2.0d, (-10.0f) * f10))) + 1.0f;
    }

    public static /* synthetic */ CharSequence lambda$parseKeys$0(String str, CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        while (i10 < i11) {
            if (!Pattern.compile(str).matcher(String.valueOf(charSequence.charAt(i10))).matches()) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            i10++;
        }
        return null;
    }

    public /* synthetic */ boolean lambda$parseKeys$1(String str, View view, int i10, KeyEvent keyEvent) {
        this.dynamicUI.addJsToWebView("window.callUICallback('" + str + "','" + i10 + "');");
        return false;
    }

    public /* synthetic */ boolean lambda$parseKeys$2(String str, View view) {
        this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback('", str, "');"));
        return false;
    }

    public /* synthetic */ void lambda$parseKeys$3(String str, View view) {
        this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback('", str, "');"));
    }

    public /* synthetic */ void lambda$parseKeys$4(String str) {
        this.dynamicUI.addJsToWebView(nn.d.k("window.callUICallback('", str, "');"));
    }

    public /* synthetic */ void lambda$parseKeys$5(String str, AdapterView adapterView, View view, int i10, long j10) {
        this.dynamicUI.addJsToWebView("window.callUICallback('" + str + "'," + i10 + ");");
    }

    public /* synthetic */ void lambda$parseKeys$6(String str, View view, boolean z10) {
        this.dynamicUI.addJsToWebView("window.callUICallback('" + str + "','" + z10 + "');");
    }

    public /* synthetic */ void lambda$parseKeys$7(String str, CalendarView calendarView, int i10, int i11, int i12) {
        this.dynamicUI.addJsToWebView("window.callUICallback('" + str + "','" + i10 + "','" + i11 + "','" + i12 + "');");
    }

    public /* synthetic */ boolean lambda$parseKeys$8(String str, MenuItem menuItem) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder s7 = da.e.s("window.callUICallback('", str, "', '");
        s7.append(menuItem.getItemId());
        s7.append("');");
        dynamicUI.addJsToWebView(s7.toString());
        return true;
    }

    private void normalTextChange(JSONObject jSONObject, Object obj) {
        obj.getClass().getMethod("addTextChangedListener", TextWatcher.class).invoke(obj, new TextWatcher() { // from class: in.juspay.hypersdk.core.InflateView.7
            private String previousText;
            final /* synthetic */ String val$js;

            public AnonymousClass7(String str) {
                r2 = str;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.previousText = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                if (this.previousText.equals(charSequence.toString())) {
                    return;
                }
                InflateView.this.dynamicUI.addJsToWebView("window.callUICallback('" + r2 + "', '" + ((Object) charSequence) + "');");
            }
        });
    }

    private Object[] parseArguments(String str, boolean z10) {
        if (str == null || str.trim().equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return new Object[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(ARG_TYPE_SPLIT);
        if (indexOf(str, FUNCTION_ARG_SPLIT, 0) == -1 || split.length == 2) {
            arrayList.add(getValue(str, z10));
        } else {
            for (String str2 : FUNCTION_ARG_SPLIT_ESCAPE.split(str)) {
                arrayList.add(getValue(str2, z10));
            }
        }
        return arrayList.toArray();
    }

    private Class<?>[] parseTypeArguments(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(ARG_TYPE_SPLIT);
        if (indexOf(str, FUNCTION_ARG_SPLIT, 0) != -1 && split.length != 2) {
            String[] split2 = FUNCTION_ARG_SPLIT_ESCAPE.split(str);
            if (split2.length > 1) {
                Class<?>[] clsArr = new Class[split2.length];
                for (int i10 = 0; i10 < split2.length; i10++) {
                    clsArr[i10] = (Class) getClassType(split2[i10]);
                }
                return clsArr;
            }
        }
        return new Class[]{(Class) getClassType(str)};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0096. Please report as an issue. */
    private Object runCommand(Object obj, Object obj2, String str, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c10;
        Callback errorCallback;
        StringBuilder sb2;
        String str6;
        StringBuilder r10;
        this.lastCommand = str;
        if (indexOf(str, KEYWORD_SPLIT, 0) != -1) {
            String str7 = substr(str, KEYWORD_SPLIT)[0];
            if (indexOf(str7, ARG_TYPE_SPLIT, 0) != -1 && str7.startsWith("get")) {
                String[] substr = substr(str7, ARG_TYPE_SPLIT);
                str2 = substr[1];
                str7 = substr[0];
            } else {
                str2 = null;
            }
            int indexOf = indexOf(str, FUNCTION_ARG_START, 0);
            String[] substr2 = substr(str, KEYWORD_SPLIT);
            if (indexOf != -1) {
                str3 = substr2[1];
                String[] substr3 = substr(str3, FUNCTION_ARG_START);
                str4 = substr3[0];
                str5 = substr3[1];
            } else {
                str3 = substr2[1];
                str4 = str3;
                str5 = null;
            }
            str7.getClass();
            switch (str7.hashCode()) {
                case -995424086:
                    if (str7.equals("parent")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 98855:
                    if (str7.equals("ctx")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102230:
                    if (str7.equals("get")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3237035:
                    if (str7.equals("infl")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3559070:
                    if (str7.equals("this")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str8 = " ";
            switch (c10) {
                case 0:
                    Method findMethodInClass = findMethodInClass(obj.getClass(), str3);
                    if (str5 != null) {
                        if (findMethodInClass != null) {
                            return findMethodInClass.invoke(obj, parseArguments(str5, z10));
                        }
                        DuiLogger logger = this.dynamicUI.getLogger();
                        StringBuilder s7 = da.e.s(" isNull : fn__runCommand - parent  classMethodDetails ", str3, " ");
                        s7.append(getErrorDetails());
                        logger.e("WARNING", s7.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                        str6 = " isNull : fn__runCommand - parent  classMethodDetails ";
                    } else {
                        if (findMethodInClass != null) {
                            return findMethodInClass.invoke(obj, new Object[0]);
                        }
                        DuiLogger logger2 = this.dynamicUI.getLogger();
                        StringBuilder s10 = da.e.s(" isNull : fn__runCommand - parent  classMethodDetails ", str3, " ");
                        s10.append(getErrorDetails());
                        logger2.e("WARNING", s10.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                        str6 = " isNull : fn__runCommand - parent classMethodDetails  ";
                    }
                    sb2.append(str6);
                    sb2.append(str3);
                    r10 = sb2;
                    r10.append(str8);
                    r10.append(getErrorDetails());
                    errorCallback.onError("WARNING", r10.toString());
                    return obj2;
                case 1:
                    Context activity = this.dynamicUI.getActivity();
                    if (activity == null) {
                        activity = this.dynamicUI.getAppContext();
                    }
                    Method findMethodInClass2 = findMethodInClass(activity.getClass(), str3);
                    if (str5 != null) {
                        if (findMethodInClass2 != null) {
                            return findMethodInClass2.invoke(activity, parseArguments(str5, z10));
                        }
                        DuiLogger logger3 = this.dynamicUI.getLogger();
                        str6 = " isNull : fn__runCommand - ctx  classMethodDetails ";
                        StringBuilder s11 = da.e.s(" isNull : fn__runCommand - ctx  classMethodDetails ", str3, " ");
                        s11.append(getErrorDetails());
                        logger3.e("WARNING", s11.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                    } else {
                        if (findMethodInClass2 != null) {
                            return findMethodInClass2.invoke(activity, new Object[0]);
                        }
                        DuiLogger logger4 = this.dynamicUI.getLogger();
                        str6 = " isNull : fn__runCommand - ctx classMethodDetails  ";
                        StringBuilder s12 = da.e.s(" isNull : fn__runCommand - ctx classMethodDetails  ", str3, " ");
                        s12.append(getErrorDetails());
                        logger4.e("WARNING", s12.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                    }
                    sb2.append(str6);
                    sb2.append(str3);
                    r10 = sb2;
                    r10.append(str8);
                    r10.append(getErrorDetails());
                    errorCallback.onError("WARNING", r10.toString());
                    return obj2;
                case 2:
                    if (str2 != null) {
                        Object obj3 = this.state.get(str2);
                        if (indexOf(str4, ARG_TYPE_SPLIT, 0) == -1 && obj3 != null) {
                            Method findMethodInClass3 = findMethodInClass(obj3.getClass(), str3);
                            if (str5 != null) {
                                if (findMethodInClass3 != null) {
                                    return findMethodInClass3.invoke(obj3, parseArguments(str5, z10));
                                }
                                DuiLogger logger5 = this.dynamicUI.getLogger();
                                str6 = " isNull : fn__runCommand - get classMethodDetails ";
                                StringBuilder s13 = da.e.s(" isNull : fn__runCommand - get classMethodDetails ", str3, " ");
                                s13.append(getErrorDetails());
                                logger5.e("WARNING", s13.toString());
                                errorCallback = this.dynamicUI.getErrorCallback();
                                sb2 = new StringBuilder();
                            } else {
                                if (findMethodInClass3 != null) {
                                    return findMethodInClass3.invoke(obj3, new Object[0]);
                                }
                                DuiLogger logger6 = this.dynamicUI.getLogger();
                                str6 = " isNull : fn__runCommand - get classMethodDetails : ";
                                StringBuilder s14 = da.e.s(" isNull : fn__runCommand - get classMethodDetails : ", str3, " ");
                                s14.append(getErrorDetails());
                                logger6.e("WARNING", s14.toString());
                                errorCallback = this.dynamicUI.getErrorCallback();
                                sb2 = new StringBuilder();
                            }
                            sb2.append(str6);
                            sb2.append(str3);
                            r10 = sb2;
                            r10.append(str8);
                            r10.append(getErrorDetails());
                            errorCallback.onError("WARNING", r10.toString());
                        } else {
                            if (obj3 != null) {
                                return findAndSetField(this.state.get(str2), substr(str4, ARG_TYPE_SPLIT)[1], substr(str3, FUNCTION_ARG_START)[1], z10);
                            }
                            DuiLogger logger7 = this.dynamicUI.getLogger();
                            str8 = " is null ";
                            StringBuilder s15 = da.e.s(" isNull : fn__runCommand - get_", str2, " is null ");
                            s15.append(getErrorDetails());
                            logger7.e("WARNING", s15.toString());
                            errorCallback = this.dynamicUI.getErrorCallback();
                            r10 = da.e.r(" isNull : fn__runCommand - get_", str2);
                            r10.append(str8);
                            r10.append(getErrorDetails());
                            errorCallback.onError("WARNING", r10.toString());
                        }
                    }
                    return obj2;
                case 3:
                    Method findMethodInClass4 = findMethodInClass(getClass(), str3);
                    if (str5 != null) {
                        if (findMethodInClass4 != null) {
                            return findMethodInClass4.invoke(this, parseArguments(str5, z10));
                        }
                        DuiLogger logger8 = this.dynamicUI.getLogger();
                        str6 = " isNull : fn__runCommand - infl  classMethodDetails ";
                        StringBuilder s16 = da.e.s(" isNull : fn__runCommand - infl  classMethodDetails ", str3, " ");
                        s16.append(getErrorDetails());
                        logger8.e("WARNING", s16.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                    } else {
                        if (findMethodInClass4 != null) {
                            return findMethodInClass4.invoke(this, new Object[0]);
                        }
                        DuiLogger logger9 = this.dynamicUI.getLogger();
                        str6 = " isNull : fn__runCommand - infl classMethodDetails  ";
                        StringBuilder s17 = da.e.s(" isNull : fn__runCommand - infl classMethodDetails  ", str3, " ");
                        s17.append(getErrorDetails());
                        logger9.e("WARNING", s17.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                    }
                    sb2.append(str6);
                    sb2.append(str3);
                    r10 = sb2;
                    r10.append(str8);
                    r10.append(getErrorDetails());
                    errorCallback.onError("WARNING", r10.toString());
                    return obj2;
                case 4:
                    Method findMethodInClass5 = findMethodInClass(obj.getClass(), str3);
                    if (str5 != null) {
                        if (findMethodInClass5 != null) {
                            return findMethodInClass5.invoke(obj, parseArguments(str5, z10));
                        }
                        DuiLogger logger10 = this.dynamicUI.getLogger();
                        str6 = " isNull : fn__runCommand - classMethodDetails  ";
                        StringBuilder s18 = da.e.s(" isNull : fn__runCommand - classMethodDetails  ", str3, " ");
                        s18.append(getErrorDetails());
                        logger10.e("WARNING", s18.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                    } else {
                        if (findMethodInClass5 != null) {
                            return findMethodInClass5.invoke(obj, new Object[0]);
                        }
                        DuiLogger logger11 = this.dynamicUI.getLogger();
                        str6 = " isNull : fn__runCommand - this  classMethodDetails ";
                        StringBuilder s19 = da.e.s(" isNull : fn__runCommand - this  classMethodDetails ", str3, " ");
                        s19.append(getErrorDetails());
                        logger11.e("WARNING", s19.toString());
                        errorCallback = this.dynamicUI.getErrorCallback();
                        sb2 = new StringBuilder();
                    }
                    sb2.append(str6);
                    sb2.append(str3);
                    r10 = sb2;
                    r10.append(str8);
                    r10.append(getErrorDetails());
                    errorCallback.onError("WARNING", r10.toString());
                    return obj2;
                default:
                    if (indexOf(str4, "var_", 0) != -1) {
                        Field declaredField = getClassName(str4).getDeclaredField(substr(str4, ARG_TYPE_SPLIT)[1]);
                        declaredField.setAccessible(true);
                        declaredField.set(null, getValue(substr(str3, FUNCTION_ARG_START)[1], z10));
                    } else if (!str3.equals("new") && !substr(str3, FUNCTION_ARG_START)[0].equals("new")) {
                        Method findMethodInClass6 = findMethodInClass(getClassName(str7), str3);
                        if (findMethodInClass6 != null) {
                            if (findMethodInClass6.getName().equals("forName")) {
                                return getClassName((String) getValue(str5, z10));
                            }
                            if (str5 != null) {
                                return findMethodInClass6.invoke(null, parseArguments(str5, z10));
                            }
                            return findMethodInClass6.invoke(null, new Object[0]);
                        }
                    } else if (str5 != null) {
                        if (str7.equals("in.juspay.hypersdk.mystique.DuiInvocationHandler")) {
                            parseArguments(str5, z10);
                        } else {
                            Class<?>[] parseTypeArguments = parseTypeArguments(str5);
                            for (Constructor<?> constructor : getClassName(str7).getConstructors()) {
                                if (constructor.getParameterTypes().length == getArgsLength(str5) && matchTypes(constructor.getParameterTypes(), parseTypeArguments)) {
                                    return constructor.newInstance(parseArguments(str5, z10));
                                }
                            }
                        }
                    } else {
                        return getClassName(str7).newInstance();
                    }
                    return obj2;
            }
        }
        if (obj2 == null) {
            if (indexOf(str, FUNCTION_ARG_START, 0) != -1) {
                return findMethodInClass(obj.getClass(), str).invoke(obj, parseArguments(substr(str, FUNCTION_ARG_START)[1], z10));
            }
            return findMethodInClass(obj.getClass(), str).invoke(obj, new Object[0]);
        }
        if (indexOf(str, FUNCTION_ARG_START, 0) != -1) {
            return findMethodInClass(obj2.getClass(), str).invoke(obj2, parseArguments(substr(str, FUNCTION_ARG_START)[1], z10));
        }
        return findMethodInClass(obj2.getClass(), str).invoke(obj2, new Object[0]);
    }

    private void separatorTextChange(JSONObject jSONObject, Object obj) {
        obj.getClass().getMethod("addTextChangedListener", TextWatcher.class).invoke(obj, new TextWatcher(jSONObject, jSONObject.getString("onChange"), (EditText) obj) { // from class: in.juspay.hypersdk.core.InflateView.8
            private static final int TOTAL_DIGITS = 21;
            private static final int TOTAL_SYMBOLS = 26;
            private final char DIVIDER;
            private final int DIVIDER_MODULO;
            private final int DIVIDER_POSITION;
            private boolean executeTextChange;
            private String previousText;
            final /* synthetic */ EditText val$cardField;
            final /* synthetic */ String val$js;
            final /* synthetic */ JSONObject val$properties;

            public AnonymousClass8(JSONObject jSONObject2, String str, EditText editText) {
                this.val$properties = jSONObject2;
                this.val$js = str;
                this.val$cardField = editText;
                int i10 = jSONObject2.getInt("separatorRepeat");
                this.DIVIDER_POSITION = i10;
                this.DIVIDER_MODULO = i10 + 1;
                this.DIVIDER = jSONObject2.getString("separator").charAt(0);
                this.executeTextChange = true;
            }

            private String buildCorrectString(char[] cArr, int i10) {
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < cArr.length; i11++) {
                    char c10 = cArr[i11];
                    if (c10 != 0) {
                        sb2.append(c10);
                        if (i11 > 0 && i11 < i10 - 1 && (i11 + 1) % this.DIVIDER_POSITION == 0) {
                            sb2.append(this.DIVIDER);
                        }
                    }
                }
                return sb2.toString();
            }

            private char[] getDigitArray(Editable editable) {
                char[] cArr = new char[21];
                int i10 = 0;
                for (int i11 = 0; i11 < editable.length() && i10 < 21; i11++) {
                    char charAt = editable.charAt(i11);
                    if (Character.isDigit(charAt)) {
                        cArr[i10] = charAt;
                        i10++;
                    }
                }
                return cArr;
            }

            private boolean isInputCorrect(Editable editable) {
                boolean z10 = editable.length() <= 26;
                int i10 = 0;
                while (i10 < editable.length()) {
                    z10 &= (i10 <= 0 || (i10 + 1) % this.DIVIDER_MODULO != 0) ? Character.isDigit(editable.charAt(i10)) : this.DIVIDER == editable.charAt(i10);
                    i10++;
                }
                return z10;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0 && this.val$cardField.isFocused() && !this.previousText.equals(editable.toString()) && this.executeTextChange) {
                    boolean z10 = this.previousText.length() > editable.length();
                    InputFilter[] filters = editable.getFilters();
                    editable.setFilters(new InputFilter[0]);
                    int selectionStart = this.val$cardField.getSelectionStart();
                    this.executeTextChange = false;
                    int i10 = selectionStart + 1;
                    if (i10 % this.DIVIDER_MODULO == 0 && z10) {
                        editable.delete(selectionStart - 1, selectionStart);
                    }
                    if (!isInputCorrect(editable)) {
                        editable.replace(0, editable.length(), buildCorrectString(getDigitArray(editable), editable.length()));
                        if (editable.length() > 0 && this.DIVIDER == editable.charAt(editable.length() - 1) && z10) {
                            editable.delete(editable.length() - 1, editable.length());
                        }
                    }
                    if (selectionStart != 0 && selectionStart % this.DIVIDER_MODULO == 0 && editable.length() > selectionStart && !z10) {
                        this.val$cardField.setSelection(i10);
                    }
                    this.executeTextChange = true;
                    editable.setFilters(filters);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.previousText = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                if (this.previousText.equals(charSequence.toString()) || !this.executeTextChange) {
                    return;
                }
                InflateView.this.dynamicUI.addJsToWebView("window.callUICallback('" + this.val$js + "', '" + ((Object) charSequence) + "');");
            }
        });
    }

    private String[] substr(String str, String str2) {
        int indexOf = indexOf(str, str2, 0);
        return indexOf == -1 ? new String[]{str} : new String[]{str.substring(0, indexOf), str.substring(str2.length() + indexOf)};
    }

    private Method tryExactMatch(Class<?> cls, String str, Class<?>[] clsArr) {
        return cls.getMethod(str, clsArr);
    }

    private Method tryMultiAgrumentDeepMatch(Class<?> cls, String str, Class<?>[] clsArr) {
        if ("undefined".equals(str)) {
            return null;
        }
        this.dynamicUI.getLogger().d(LOG_TAG, "tryMultiAgrumentDeepMatch reached. Beware slow function.. " + cls.toString() + " : " + str + " : " + clsArr.length);
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == clsArr.length && matchTypes(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    private Method trySingleArgumentDeepMatch(Class<?> cls, String str, Class<?> cls2) {
        if (isWrappedPrimitiveType(cls2)) {
            try {
                return cls.getMethod(str, PRIMITIVE_TYPES.get(cls2));
            } catch (NoSuchMethodException unused) {
            }
        }
        do {
            for (Class<?> cls3 : cls2.getInterfaces()) {
                try {
                    return cls.getMethod(str, cls3);
                } catch (NoSuchMethodException unused2) {
                }
            }
            try {
                return cls.getMethod(str, cls2);
            } catch (NoSuchMethodException unused3) {
                cls2 = cls2.getSuperclass();
            }
        } while (cls2 != null);
        this.dynamicUI.getLogger().e(LOG_TAG, "Never reach here");
        return null;
    }

    @NonNull
    @Keep
    public Boolean containsInState(String str) {
        return Boolean.valueOf(this.state.containsKey(str));
    }

    @Keep
    public void convertAndStoreArray(ArrayList<?> arrayList, Class<?> cls, String str, boolean z10) {
        int size = arrayList.size();
        if (z10) {
            cls = PRIMITIVE_TYPES.get(cls);
        }
        if (cls != null) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(newInstance, i10, arrayList.get(i10));
            }
            this.state.put(str, newInstance);
        }
    }

    @Keep
    public Class<?> createPrimitiveClass(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100:
                if (str.equals("d")) {
                    c10 = 2;
                    break;
                }
                break;
            case 102:
                if (str.equals("f")) {
                    c10 = 3;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 4;
                    break;
                }
                break;
            case 108:
                if (str.equals("l")) {
                    c10 = 5;
                    break;
                }
                break;
            case 115:
                if (str.equals("s")) {
                    c10 = 6;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3159:
                if (str.equals("by")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Boolean.TYPE;
            case 1:
                return Character.TYPE;
            case 2:
                return Double.TYPE;
            case 3:
                return Float.TYPE;
            case 4:
                return Integer.TYPE;
            case 5:
                return Long.TYPE;
            case 6:
                return Short.TYPE;
            case 7:
                return Void.TYPE;
            case '\b':
                return Byte.TYPE;
            default:
                return null;
        }
    }

    public void dismissPopUp() {
        ExecutorManager.runOnMainThread(new t(this, 0));
    }

    public float dpToPx(float f10) {
        return f10 > s0.g.f34069a ? Math.round(f10 * this.dynamicUI.getAppContext().getResources().getDisplayMetrics().density) : s0.g.f34069a;
    }

    public Pair<String, ObjectAnimator> findAnimationById(String str) {
        String f10 = a3.a.f("M_anim_", str);
        if (this.state.containsKey(f10)) {
            return (Pair) this.state.get(f10);
        }
        return null;
    }

    public Method findMethodWithCmd(Cmd cmd) {
        Method tryMultiAgrumentDeepMatch;
        if (this.functionCache.containsKey(cmd)) {
            return this.functionCache.get(cmd);
        }
        try {
            tryMultiAgrumentDeepMatch = tryExactMatch(cmd.clazz, cmd.functionName, cmd.args);
        } catch (NoSuchMethodException unused) {
            tryMultiAgrumentDeepMatch = (cmd.args == null || cmd.args.length != 1) ? tryMultiAgrumentDeepMatch(cmd.clazz, cmd.functionName, cmd.args) : trySingleArgumentDeepMatch(cmd.clazz, cmd.functionName, cmd.args[0]);
        }
        this.functionCache.put(cmd, tryMultiAgrumentDeepMatch);
        return tryMultiAgrumentDeepMatch;
    }

    public Class<?> getClassName(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1409106502:
                if (str.equals("in.juspay.mystique.BottomSheetLayout")) {
                    c10 = 0;
                    break;
                }
                break;
            case -833865840:
                if (str.equals("in.juspay.mystique.SwypeLayout")) {
                    c10 = 1;
                    break;
                }
                break;
            case -631823565:
                if (str.equals("in.juspay.mystique.SwypeScroll")) {
                    c10 = 2;
                    break;
                }
                break;
            case -407376626:
                if (str.equals("in.juspay.mystique.AccordionLayout")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return BottomSheetLayout.class;
            case 1:
                return SwypeLayout.class;
            case 2:
                return SwypeScroll.class;
            case 3:
                return AccordionLayout.class;
            default:
                return Class.forName(str);
        }
    }

    public DynamicUI getDUI() {
        return this.dynamicUI;
    }

    public String getErrorDetails() {
        return this.currViewId + " - " + this.currView + "-" + this.fileOrigin + " - " + this.lastCommand;
    }

    @NonNull
    public HashMap<String, Object> getState() {
        return this.state;
    }

    public <T> T getStateValFromKey(String str) {
        return (T) this.state.get(str);
    }

    public boolean getUseAppContext() {
        return this.useAppContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Any> Any getValueNew(String str, String str2) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -891988091:
                if (str.equals("strget")) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str.equals("b")) {
                    c10 = 1;
                    break;
                }
                break;
            case 102:
                if (str.equals("f")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 3;
                    break;
                }
                break;
            case 108:
                if (str.equals("l")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3212:
                if (str.equals("dp")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3677:
                if (str.equals("sp")) {
                    c10 = 6;
                    break;
                }
                break;
            case 98855:
                if (str.equals("ctx")) {
                    c10 = 7;
                    break;
                }
                break;
            case 99674:
                if (str.equals("dpf")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 102230:
                if (str.equals("get")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3237035:
                if (str.equals("infl")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3392903:
                if (str.equals("null")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return (Any) (this.state.get(str2) + HttpUrl.FRAGMENT_ENCODE_SET);
            case 1:
                return (Any) Boolean.valueOf(Boolean.parseBoolean(str2));
            case 2:
                return (Any) Float.valueOf(Float.parseFloat(str2));
            case 3:
                return (Any) Integer.valueOf(Integer.parseInt(str2));
            case 4:
                return (Any) Long.valueOf(Long.parseLong(str2));
            case 5:
                return (Any) Integer.valueOf(dpToPx(Integer.parseInt(str2)));
            case 6:
                return (Any) Float.valueOf(Float.parseFloat(str2) * this.dynamicUI.getAppContext().getResources().getDisplayMetrics().scaledDensity);
            case 7:
                return (this.dynamicUI.getActivity() == null || this.useAppContext) ? (Any) this.dynamicUI.getAppContext() : (Any) this.dynamicUI.getActivity();
            case '\b':
                return (Any) Float.valueOf(dpToPx(Float.parseFloat(str2)));
            case '\t':
                return (Any) this.state.get(str2);
            case '\n':
                return this;
            case 11:
                return null;
            default:
                return str2;
        }
    }

    public void handleAnimation(Object obj, JSONArray jSONArray) {
        String str;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString("props"));
            boolean has = jSONObject.has("id");
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (has) {
                str = jSONObject.getString("id");
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (jSONObject.has("onEnd")) {
                str2 = jSONObject.getString("onEnd");
            }
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[jSONArray2.length()];
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                propertyValuesHolderArr[i11] = PropertyValuesHolder.ofFloat(jSONObject2.getString("prop"), (float) jSONObject2.getDouble("from"), (float) jSONObject2.getDouble("to"));
            }
            ObjectAnimator animator = getAnimator(obj, propertyValuesHolderArr, jSONObject);
            Pair pair = new Pair(Integer.valueOf(((View) obj).getId()), animator);
            this.state.put("M_anim_" + str, pair);
            if (jSONObject.has("onEnd")) {
                animator.addListener(new Animator.AnimatorListener() { // from class: in.juspay.hypersdk.core.InflateView.6
                    final /* synthetic */ String val$finalOnEndId;
                    final /* synthetic */ ObjectAnimator val$objAnim;

                    public AnonymousClass6(String str3, ObjectAnimator animator2) {
                        r2 = str3;
                        r3 = animator2;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NonNull Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NonNull Animator animator2) {
                        ObjectAnimator objectAnimator;
                        if (!InflateView.this.state.containsKey(r2) || (objectAnimator = (ObjectAnimator) ((Pair) InflateView.this.state.get(r2)).second) == null || objectAnimator == r3) {
                            return;
                        }
                        objectAnimator.start();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NonNull Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NonNull Animator animator2) {
                    }
                });
            }
        }
    }

    public boolean matchTypes(Class<?>[] clsArr, Class<?>[] clsArr2) {
        Class<?> cls;
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (clsArr2[i10] != null && (cls = clsArr[i10]) != null && ((!cls.equals(Object.class) || clsArr2[i10].isPrimitive()) && !clsArr[i10].equals(clsArr2[i10]))) {
                if (clsArr[i10].isPrimitive() && !clsArr2[i10].isArray()) {
                    try {
                        Class cls2 = (Class) clsArr2[i10].getField("TYPE").get(null);
                        if (cls2 != null && !cls2.equals(clsArr[i10])) {
                            return false;
                        }
                    } catch (NoSuchFieldException unused) {
                        return false;
                    } catch (Exception unused2) {
                        return true;
                    }
                } else if (clsArr[i10].equals(ClassLoader.class)) {
                    if (clsArr2[i10].getName().equals("dalvik.system.PathClassLoader")) {
                        return true;
                    }
                } else if (!clsArr[i10].equals(clsArr2[i10]) && !clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                    return false;
                }
            }
        }
        return true;
    }

    public Object parseAndRunPipe(Object obj, String str, boolean z10) {
        Object obj2 = null;
        for (String str2 : COMMAND_SPLIT.split(str)) {
            if (!str2.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                if (indexOf(str2, SETTER_EQUALS, 0) != -1) {
                    String[] substr = substr(str2, SETTER_EQUALS);
                    String str3 = substr(substr[0], ARG_TYPE_SPLIT)[1];
                    Object runCommand = runCommand(obj, obj2, substr[1], z10);
                    this.state.put(str3, runCommand);
                    this.dynamicUI.getLogger().d(LOG_TAG, "setting " + str3 + " to " + runCommand);
                } else {
                    obj2 = runCommand(obj, obj2, str2, z10);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0609  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseKeys(java.lang.String r30, org.json.JSONObject r31, java.lang.Object r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.parseKeys(java.lang.String, org.json.JSONObject, java.lang.Object, boolean):void");
    }

    public void putInState(String str, Object obj) {
        this.state.put(str, obj);
    }

    public void resetState() {
        this.state = new HashMap<>();
    }

    public void setCurrView(String str) {
        this.currView = str;
    }

    public void setCurrViewId(String str) {
        this.currViewId = str;
    }

    public void setFileOrigin(String str) {
        this.fileOrigin = str;
    }

    public void setUseAppContext(boolean z10) {
        this.useAppContext = z10;
    }

    public int dpToPx(int i10) {
        if (i10 > 0) {
            return Math.round(i10 * this.dynamicUI.getAppContext().getResources().getDisplayMetrics().density);
        }
        return 0;
    }
}
