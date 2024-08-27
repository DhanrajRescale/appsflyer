package in.juspay.hypersdk.core;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.services.SdkConfigService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Renderer {

    @NonNull
    private final DynamicUI dynamicUI;
    private int viewCacheCapacity;

    @NonNull
    ConcurrentHashMap<String, List<View>> viewCache = new ConcurrentHashMap<>();

    @NonNull
    private final HashMap<String, ViewGroup> container = new HashMap<>();

    @NonNull
    private final HashMap<String, View> prevView = new HashMap<>();

    /* loaded from: classes2.dex */
    public static class RenderTreeNode {
        View itself;
        ViewGroup parent;

        public RenderTreeNode(ViewGroup viewGroup, View view) {
            this.parent = viewGroup;
            this.itself = view;
        }
    }

    public Renderer(@NonNull DynamicUI dynamicUI) {
        this.dynamicUI = dynamicUI;
        try {
            this.viewCacheCapacity = SdkConfigService.getCachedSdkConfig().getJSONObject("uiFeatures").getJSONObject("nbListItemCaching").getInt("bgCacheCapacity");
        } catch (Exception unused) {
            this.viewCacheCapacity = 4;
        }
        try {
            initCache();
        } catch (Exception e10) {
            dynamicUI.getLogger().e("Error while initializing cache", e10.toString());
        }
    }

    private void addViewFromRenderTreeNodeQueue(Queue<RenderTreeNode> queue) {
        while (!queue.isEmpty()) {
            RenderTreeNode poll = queue.poll();
            if (poll != null) {
                poll.parent.addView(poll.itself);
            }
        }
    }

    private View createAllNodesAndReturnRoot(JSONObject jSONObject, Queue<RenderTreeNode> queue, boolean z10) {
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("props");
        if (jSONObject.has("props")) {
            setCurrentNodeDetails(string, jSONObject2);
        }
        Object newInstanceFromClassName = getNewInstanceFromClassName(string);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            this.dynamicUI.getInflateView().parseKeys(keys.next(), jSONObject2, newInstanceFromClassName, z10);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                queue.add(new RenderTreeNode((ViewGroup) newInstanceFromClassName, createAllNodesAndReturnRoot(jSONArray.getJSONObject(i10), queue, z10)));
            }
        }
        return (View) newInstanceFromClassName;
    }

    private View createNodesAndReturnRoot(JSONObject jSONObject, InflateView inflateView) {
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("props");
        if (jSONObject.has("props")) {
            setCurrentNodeDetails(string, jSONObject2);
        }
        Object newInstanceFromClassName = getNewInstanceFromClassName(string);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            inflateView.parseKeys(keys.next(), jSONObject2, newInstanceFromClassName, inflateView.getUseAppContext());
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                ((ViewGroup) newInstanceFromClassName).addView(createNodesAndReturnRoot(jSONArray.getJSONObject(i10), inflateView));
            }
        }
        return (View) newInstanceFromClassName;
    }

    private Object getNewInstanceFromClassName(String str) {
        Context appContext = this.dynamicUI.getAppContext();
        View cachedViewFor = getCachedViewFor(str);
        if (cachedViewFor != null) {
            return cachedViewFor;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2096886772:
                if (str.equals("android.widget.FrameLayout")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1973910559:
                if (str.equals("android.widget.RelativeLayout")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1929723370:
                if (str.equals("android.view.TextureView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1430722502:
                if (str.equals("android.widget.LinearLayout")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1238256809:
                if (str.equals("androidx.swiperefreshlayout.widget.SwipeRefreshLayout")) {
                    c10 = 4;
                    break;
                }
                break;
            case -214285650:
                if (str.equals("android.widget.CheckBox")) {
                    c10 = 5;
                    break;
                }
                break;
            case -149114526:
                if (str.equals("android.widget.EditText")) {
                    c10 = 6;
                    break;
                }
                break;
            case -50131582:
                if (str.equals("android.widget.ImageButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 670921973:
                if (str.equals("android.widget.ImageView")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 841510749:
                if (str.equals("android.widget.ScrollView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1540240509:
                if (str.equals("android.widget.TextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1583615229:
                if (str.equals("android.widget.Button")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1663696930:
                if (str.equals("android.widget.RadioButton")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new FrameLayout(appContext);
            case 1:
                return new RelativeLayout(appContext);
            case 2:
                return new TextureView(appContext);
            case 3:
                return new LinearLayout(appContext);
            case 4:
                return new SwipeRefreshLayout(appContext, null);
            case 5:
                return new CheckBox(appContext);
            case 6:
                return new EditText(appContext);
            case 7:
                return new ImageButton(appContext);
            case '\b':
                return new ImageView(appContext);
            case '\t':
                return new ScrollView(appContext);
            case '\n':
                return new TextView(appContext);
            case 11:
                return new Button(appContext);
            case '\f':
                return new RadioButton(appContext);
            default:
                return getInflateView().getClassName(str).getConstructor(Context.class).newInstance(appContext);
        }
    }

    private void initCache() {
        ExecutorManager.runOnBackgroundThread(new i(8, this, new String[]{"android.widget.RelativeLayout", "android.widget.LinearLayout", "android.widget.ImageView", "android.widget.ScrollView", "android.widget.TextView", "android.widget.EditText", "android.widget.FrameLayout"}));
    }

    public /* synthetic */ void lambda$initCache$0(String[] strArr) {
        List<View> synchronizedList = Collections.synchronizedList(new ArrayList());
        for (String str : strArr) {
            for (int i10 = 0; i10 < this.viewCacheCapacity; i10++) {
                try {
                    synchronizedList.add((View) Class.forName(str).getConstructor(Context.class).newInstance(this.dynamicUI.getAppContext()));
                } catch (Exception e10) {
                    this.dynamicUI.getLogger().e("Error while initializing cache in function", e10.toString());
                }
            }
            this.viewCache.put(str, synchronizedList);
            synchronizedList = Collections.synchronizedList(new ArrayList());
        }
    }

    public /* synthetic */ void lambda$replenishCache$1(String str) {
        List<View> list = this.viewCache.get(str);
        if (list == null) {
            list = Collections.synchronizedList(new ArrayList());
            this.viewCache.put(str, list);
        }
        if (list.size() < this.viewCacheCapacity) {
            try {
                list.add((View) Class.forName(str).getConstructor(Context.class).newInstance(this.dynamicUI.getAppContext()));
            } catch (Exception unused) {
            }
        }
    }

    private void removeViewFromContainer(View view, String str) {
        ViewGroup viewGroup = this.container.get(str);
        if (viewGroup != null) {
            viewGroup.removeViewAt(viewGroup.indexOfChild(view));
        }
    }

    private void render(View view, String str) {
        ViewGroup viewGroup = this.container.get(str);
        if (view != null && viewGroup != null) {
            viewGroup.addView(view);
            return;
        }
        this.dynamicUI.getErrorCallback().onError("ERROR", " isNull : fn__Render -  instance null " + getErrorDetails());
    }

    public void addStoredViewToParent(String str, String str2, int i10, boolean z10, String str3) {
        Callback errorCallback;
        StringBuilder sb2;
        int identifier = this.dynamicUI.getAppContext().getResources().getIdentifier(str, "id", this.dynamicUI.getAppContext().getPackageName());
        if (i10 >= 0) {
            ViewGroup container = this.dynamicUI.getContainer(str3);
            if (container == null) {
                this.dynamicUI.getErrorCallback().onError("ERROR", " isNull : fn__addViewToParent - container null " + getErrorDetails());
                return;
            }
            ViewGroup viewGroup = (ViewGroup) container.findViewById(identifier);
            if (z10) {
                viewGroup.removeAllViews();
            }
            View view = (View) this.dynamicUI.getViewFromScreenName(str2);
            if (view != null) {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                viewGroup.addView(view, i10);
                return;
            }
            errorCallback = this.dynamicUI.getErrorCallback();
            sb2 = new StringBuilder(" isNull : fn__addViewToParent - child null ");
        } else {
            errorCallback = this.dynamicUI.getErrorCallback();
            sb2 = new StringBuilder(" isNull : fn__addViewToParent - negative index ");
        }
        sb2.append(getErrorDetails());
        errorCallback.onError("ERROR", sb2.toString());
    }

    public void addViewToParent(String str, JSONObject jSONObject, int i10, boolean z10, String str2) {
        int identifier = this.dynamicUI.getAppContext().getResources().getIdentifier(str, "id", this.dynamicUI.getAppContext().getPackageName());
        ViewGroup container = this.dynamicUI.getContainer(str2);
        if (i10 < 0 || container == null) {
            if (container == null) {
                this.dynamicUI.getLogger().e("Missing Container", "addViewToParent, InflateView, it is not  activity, it is applicationContext");
            }
            if (jSONObject.has("props")) {
                setCurrentNodeDetails(jSONObject.getString("type"), jSONObject.getJSONObject("props"));
            }
            this.dynamicUI.getErrorCallback().onError("ERROR", " isNull : fn__addViewToParent - negative index " + getErrorDetails());
            return;
        }
        ViewGroup viewGroup = (ViewGroup) container.findViewById(identifier);
        if (z10) {
            viewGroup.removeAllViews();
        }
        LinkedList linkedList = new LinkedList();
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        View createAllNodesAndReturnRoot = createAllNodesAndReturnRoot(jSONObject, linkedList, inflateJSON.getUseAppContext());
        addViewFromRenderTreeNodeQueue(linkedList);
        viewGroup.addView(createAllNodesAndReturnRoot, i10);
    }

    public View createView(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("props");
        if (jSONObject.has("props")) {
            setCurrentNodeDetails(string, jSONObject2);
        }
        Object newInstanceFromClassName = getNewInstanceFromClassName(string);
        Iterator<String> keys = jSONObject2.keys();
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        while (keys.hasNext()) {
            this.dynamicUI.getInflateView().parseKeys(keys.next(), jSONObject2, newInstanceFromClassName, inflateJSON.getUseAppContext());
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                View createView = createView(jSONArray.getJSONObject(i10));
                if (createView != null) {
                    ((ViewGroup) newInstanceFromClassName).addView(createView);
                }
            }
        }
        return (View) newInstanceFromClassName;
    }

    public void dismissPopUp() {
        this.dynamicUI.getInflateView().dismissPopUp();
    }

    public View getCachedViewFor(String str) {
        List<View> list = this.viewCache.get(str);
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            replenishCache(str);
            return null;
        }
        View remove = list.remove(0);
        if (size < this.viewCacheCapacity) {
            replenishCache(str);
        }
        return remove;
    }

    public String getErrorDetails() {
        return this.dynamicUI.getInflateView().getErrorDetails();
    }

    public InflateView getInflateView() {
        return this.dynamicUI.getInflateView();
    }

    public void parseAndRunPipe(Object obj, String str, String str2, String str3, boolean z10) {
        this.dynamicUI.getInflateView().setCurrView("modifyDom");
        this.dynamicUI.getInflateView().setCurrViewId(HttpUrl.FRAGMENT_ENCODE_SET);
        this.dynamicUI.getInflateView().setFileOrigin("ln: " + str2 + " " + str3);
        this.dynamicUI.getInflateView().parseAndRunPipe(obj, str, z10);
    }

    public void prepareAndStoreView(String str, JSONObject jSONObject) {
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        this.dynamicUI.addToScreenMap(str, createNodesAndReturnRoot(jSONObject, inflateJSON));
    }

    public void renderUI(JSONObject jSONObject, ViewGroup viewGroup, String str) {
        renderUI(jSONObject, viewGroup, true, str);
    }

    public void replenishCache(String str) {
        ExecutorManager.runOnBackgroundThread(new i(7, this, str));
    }

    public void setCurrentNodeDetails(String str, JSONObject jSONObject) {
        this.dynamicUI.getInflateView().setCurrView(str);
        if (jSONObject.has("node_id")) {
            this.dynamicUI.getInflateView().setCurrViewId(jSONObject.getString("node_id"));
        }
        if (jSONObject.has("__filename")) {
            this.dynamicUI.getInflateView().setFileOrigin(jSONObject.getString("__filename"));
        }
    }

    public void renderUI(JSONObject jSONObject, ViewGroup viewGroup, boolean z10, String str) {
        if (str == null) {
            str = LogConstants.DEFAULT_CHANNEL;
        }
        this.container.put(str, viewGroup);
        LinkedList linkedList = new LinkedList();
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        View createAllNodesAndReturnRoot = createAllNodesAndReturnRoot(jSONObject, linkedList, inflateJSON.getUseAppContext());
        if (z10 && this.prevView.get(str) != createAllNodesAndReturnRoot) {
            removeViewFromContainer(this.prevView.get(str), str);
        }
        addViewFromRenderTreeNodeQueue(linkedList);
        render(createAllNodesAndReturnRoot, str);
        this.prevView.put(str, createAllNodesAndReturnRoot);
    }
}
