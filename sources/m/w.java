package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.assetgro.stockgro.data.TokenInvalidationInterceptor;
import com.assetgro.stockgro.data.remote.BaseInterceptor;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f25760a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25761b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25762c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25763d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25764e;

    /* renamed from: f, reason: collision with root package name */
    public Object f25765f;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f25760a = obj;
        this.f25761b = obj2;
        this.f25762c = obj3;
        this.f25763d = obj4;
        this.f25764e = obj5;
        this.f25765f = obj6;
    }

    public static boolean b(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(int i10, Context context) {
        int c10 = m3.c(R.attr.colorControlHighlight, context);
        return new ColorStateList(new int[][]{m3.f25625b, m3.f25627d, m3.f25626c, m3.f25629f}, new int[]{m3.b(R.attr.colorButtonNormal, context), u3.a.b(c10, i10), u3.a.b(c10, i10), i10});
    }

    public static LayerDrawable f(r2 r2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable e10 = r2Var.e(context, R.drawable.abc_star_black_48dp);
        Drawable e11 = r2Var.e(context, R.drawable.abc_star_half_black_48dp);
        if ((e10 instanceof BitmapDrawable) && e10.getIntrinsicWidth() == dimensionPixelSize && e10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) e10;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            e10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e10.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((e11 instanceof BitmapDrawable) && e11.getIntrinsicWidth() == dimensionPixelSize && e11.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) e11;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            e11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e11.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void j(Drawable drawable, int i10, PorterDuff.Mode mode) {
        int[] iArr = q1.f25681a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = x.f25795b;
        }
        mutate.setColorFilter(x.c(i10, mode));
    }

    public final void a(String str, String str2) {
        Map map = (Map) this.f25765f;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final jn.h c() {
        String str;
        if (((String) this.f25760a) == null) {
            str = " transportName";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (((jn.l) this.f25762c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f25763d) == null) {
            str = jr.h.r(str, " eventMillis");
        }
        if (((Long) this.f25764e) == null) {
            str = jr.h.r(str, " uptimeMillis");
        }
        if (((Map) this.f25765f) == null) {
            str = jr.h.r(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new jn.h((String) this.f25760a, (Integer) this.f25761b, (jn.l) this.f25762c, ((Long) this.f25763d).longValue(), ((Long) this.f25764e).longValue(), (Map) this.f25765f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final Task e(Task task) {
        return task.continueWith(new n.a(8), new dj.e(this, 24));
    }

    public final ColorStateList g(int i10, Context context) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return r3.k.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131230881) {
            return r3.k.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i10 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d10 = m3.d(R.attr.colorSwitchThumbNormal, context);
            if (d10 != null && d10.isStateful()) {
                int[] iArr3 = m3.f25625b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = m3.f25628e;
                iArr2[1] = m3.c(R.attr.colorControlActivated, context);
                iArr[2] = m3.f25629f;
                iArr2[2] = d10.getDefaultColor();
            } else {
                iArr[0] = m3.f25625b;
                iArr2[0] = m3.b(R.attr.colorSwitchThumbNormal, context);
                iArr[1] = m3.f25628e;
                iArr2[1] = m3.c(R.attr.colorControlActivated, context);
                iArr[2] = m3.f25629f;
                iArr2[2] = m3.c(R.attr.colorSwitchThumbNormal, context);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
            return d(m3.c(R.attr.colorButtonNormal, context), context);
        }
        if (i10 == R.drawable.abc_btn_borderless_material) {
            return d(0, context);
        }
        if (i10 == R.drawable.abc_btn_colored_material) {
            return d(m3.c(R.attr.colorAccent, context), context);
        }
        if (i10 != 2131230876 && i10 != R.drawable.abc_spinner_textfield_background_material) {
            if (b((int[]) this.f25761b, i10)) {
                return m3.d(R.attr.colorControlNormal, context);
            }
            if (b((int[]) this.f25764e, i10)) {
                return r3.k.getColorStateList(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f25765f, i10)) {
                return r3.k.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return r3.k.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return r3.k.getColorStateList(context, R.color.abc_tint_spinner);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ea.p0 p0Var = (ea.p0) this.f25760a;
        HttpLoggingInterceptor httpLoggingInterceptor = (HttpLoggingInterceptor) ((Provider) this.f25761b).get();
        long longValue = ((Long) ((Provider) this.f25762c).get()).longValue();
        Context context = (Context) ((Provider) this.f25763d).get();
        TokenInvalidationInterceptor tokenInvalidationInterceptor = (TokenInvalidationInterceptor) ((Provider) this.f25764e).get();
        BaseInterceptor baseInterceptor = (BaseInterceptor) ((Provider) this.f25765f).get();
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor, "httpLoggingInterceptor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tokenInvalidationInterceptor, "tokenInvalidationInterceptor");
        Intrinsics.checkNotNullParameter(baseInterceptor, "baseInterceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder writeTimeout = builder.readTimeout(longValue, timeUnit).writeTimeout(longValue, timeUnit);
        writeTimeout.addInterceptor(httpLoggingInterceptor).addInterceptor(tokenInvalidationInterceptor).addInterceptor(baseInterceptor);
        OkHttpClient build = writeTimeout.build();
        yk.g.j(build);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.w.h(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final void i(jn.l lVar) {
        if (lVar != null) {
            this.f25762c = lVar;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    public final void k() {
        l.a0 a0Var = (l.a0) this.f25763d;
        if (!a0Var.b()) {
            if (a0Var.f23551f != null) {
                a0Var.d(0, 0, false, false);
                return;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(JsonWriter jsonWriter, View view) {
        String str;
        q.h hVar;
        Object a10;
        if (view.getVisibility() == 4 && ((ls.d0) this.f25760a).f25170v) {
            return;
        }
        int id2 = view.getId();
        if (-1 == id2) {
            str = null;
        } else {
            str = (String) ((SparseArray) ((l.d) this.f25765f).f23561c).get(id2);
        }
        jsonWriter.beginObject();
        jsonWriter.name("hashCode").value(view.hashCode());
        jsonWriter.name("id").value(id2);
        jsonWriter.name("mp_id_name").value(str);
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription == null) {
            jsonWriter.name("contentDescription").nullValue();
        } else {
            jsonWriter.name("contentDescription").value(contentDescription.toString());
        }
        Object tag = view.getTag();
        if (tag == null) {
            jsonWriter.name("tag").nullValue();
        } else if (tag instanceof CharSequence) {
            jsonWriter.name("tag").value(tag.toString());
        }
        jsonWriter.name("top").value(view.getTop());
        jsonWriter.name("left").value(view.getLeft());
        jsonWriter.name("width").value(view.getWidth());
        jsonWriter.name("height").value(view.getHeight());
        jsonWriter.name("scrollX").value(view.getScrollX());
        jsonWriter.name("scrollY").value(view.getScrollY());
        jsonWriter.name("visibility").value(view.getVisibility());
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        jsonWriter.name("translationX").value(translationX);
        jsonWriter.name("translationY").value(translationY);
        jsonWriter.name("classes");
        jsonWriter.beginArray();
        Class<?> cls = view.getClass();
        do {
            jsonWriter.value((String) ((os.v) this.f25763d).get(cls));
            cls = cls.getSuperclass();
            if (cls == Object.class) {
                break;
            }
        } while (cls != null);
        jsonWriter.endArray();
        Class<?> cls2 = view.getClass();
        for (os.m mVar : (List) this.f25762c) {
            if (mVar.f30359b.isAssignableFrom(cls2) && (hVar = mVar.f30360c) != null && (a10 = hVar.a(view, (Object[]) hVar.f31451c)) != null) {
                boolean z10 = a10 instanceof Number;
                String str2 = mVar.f30358a;
                if (z10) {
                    jsonWriter.name(str2).value((Number) a10);
                } else if (a10 instanceof Boolean) {
                    jsonWriter.name(str2).value(((Boolean) a10).booleanValue());
                } else if (a10 instanceof ColorStateList) {
                    jsonWriter.name(str2).value(Integer.valueOf(((ColorStateList) a10).getDefaultColor()));
                } else if (a10 instanceof Drawable) {
                    Drawable drawable = (Drawable) a10;
                    Rect bounds = drawable.getBounds();
                    jsonWriter.name(str2);
                    jsonWriter.beginObject();
                    jsonWriter.name("classes");
                    jsonWriter.beginArray();
                    for (Class<?> cls3 = drawable.getClass(); cls3 != Object.class; cls3 = cls3.getSuperclass()) {
                        jsonWriter.value(cls3.getCanonicalName());
                    }
                    jsonWriter.endArray();
                    jsonWriter.name("dimensions");
                    jsonWriter.beginObject();
                    jsonWriter.name("left").value(bounds.left);
                    jsonWriter.name("right").value(bounds.right);
                    jsonWriter.name("top").value(bounds.top);
                    jsonWriter.name("bottom").value(bounds.bottom);
                    jsonWriter.endObject();
                    if (drawable instanceof ColorDrawable) {
                        jsonWriter.name("color").value(((ColorDrawable) drawable).getColor());
                    }
                    jsonWriter.endObject();
                } else {
                    jsonWriter.name(str2).value(a10.toString());
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int[] rules = ((RelativeLayout.LayoutParams) layoutParams).getRules();
            jsonWriter.name("layoutRules");
            jsonWriter.beginArray();
            for (int i10 : rules) {
                jsonWriter.value(i10);
            }
            jsonWriter.endArray();
        }
        jsonWriter.name("subviews");
        jsonWriter.beginArray();
        boolean z11 = view instanceof ViewGroup;
        if (z11) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (viewGroup.getChildAt(i11) != null) {
                    jsonWriter.value(r5.hashCode());
                }
            }
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
        if (z11) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int childCount2 = viewGroup2.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt = viewGroup2.getChildAt(i12);
                if (childAt != null) {
                    l(jsonWriter, childAt);
                }
            }
        }
    }

    public final void m(com.google.firebase.messaging.t tVar, BufferedOutputStream bufferedOutputStream) {
        ((os.w) this.f25761b).f30402a = tVar;
        FutureTask futureTask = new FutureTask((os.w) this.f25761b);
        ((Handler) this.f25764e).post(futureTask);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream);
        List emptyList = Collections.emptyList();
        outputStreamWriter.write("[");
        try {
            emptyList = (List) futureTask.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            el.l.G("MixpanelAPI.Snapshot", "Screenshot interrupted, no screenshot will be sent.", e10);
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.Snapshot", "Exception thrown during screenshot attempt", e11);
        } catch (TimeoutException e12) {
            el.l.m0("MixpanelAPI.Snapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", e12);
        }
        int size = emptyList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                outputStreamWriter.write(",");
            }
            os.x xVar = (os.x) emptyList.get(i10);
            outputStreamWriter.write(UrlTreeKt.componentParamPrefix);
            outputStreamWriter.write("\"activity\":");
            outputStreamWriter.write(JSONObject.quote(xVar.f30406a));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"scale\":");
            outputStreamWriter.write(String.format("%s", Float.valueOf(xVar.f30409d)));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"serialized_objects\":");
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("rootObject").value(xVar.f30407b.hashCode());
            jsonWriter.name("objects");
            View view = xVar.f30407b;
            jsonWriter.beginArray();
            l(jsonWriter, view);
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"screenshot\":");
            outputStreamWriter.flush();
            wn.e eVar = xVar.f30408c;
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            synchronized (eVar) {
                try {
                    Object obj = eVar.f39327b;
                    if (((Bitmap) obj) != null && ((Bitmap) obj).getWidth() != 0 && ((Bitmap) eVar.f39327b).getHeight() != 0) {
                        bufferedOutputStream.write(34);
                        Base64OutputStream base64OutputStream = new Base64OutputStream(bufferedOutputStream, 2);
                        ((Bitmap) eVar.f39327b).compress(compressFormat, 100, base64OutputStream);
                        base64OutputStream.flush();
                        bufferedOutputStream.write(34);
                    }
                    bufferedOutputStream.write("null".getBytes());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            outputStreamWriter.write(UrlTreeKt.componentParamSuffix);
        }
        outputStreamWriter.write("]");
        outputStreamWriter.flush();
    }

    public final Task n(String str, String str2, Bundle bundle) {
        try {
            h(str, str2, bundle);
            return ((Rpc) this.f25762c).send(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    public w(Context context, ArrayList arrayList, l.d dVar) {
        this.f25760a = ls.d0.a(context);
        this.f25762c = arrayList;
        this.f25765f = dVar;
        this.f25764e = new Handler(Looper.getMainLooper());
        this.f25761b = new os.w();
        this.f25763d = new LruCache(255);
    }

    public w(int i10) {
        if (i10 != 4) {
            this.f25760a = new int[]{2131230891, 2131230889, 2131230815};
            this.f25761b = new int[]{2131230839, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            this.f25762c = new int[]{2131230888, 2131230890, 2131230832, R.drawable.abc_text_cursor_material, 2131230885, 2131230886, 2131230887};
            this.f25763d = new int[]{2131230864, R.drawable.abc_cab_background_internal_bg, 2131230863};
            this.f25764e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            this.f25765f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
        }
    }

    public w(Context context, View view) {
        this.f25760a = context;
        this.f25762c = view;
        l.o oVar = new l.o(context);
        this.f25761b = oVar;
        oVar.w(new hr.c(this, 3));
        l.a0 a0Var = new l.a0(R.attr.popupMenuStyle, 0, context, view, (l.o) this.f25761b, false);
        this.f25763d = a0Var;
        a0Var.f23552g = 0;
        a0Var.f23556k = new l.y(this, 1);
    }
}
