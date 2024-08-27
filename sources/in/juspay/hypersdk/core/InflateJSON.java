package in.juspay.hypersdk.core;

import androidx.annotation.NonNull;
import in.juspay.hypersdk.core.InflateView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class InflateJSON extends InflateView {
    private final String ARGS;
    private final String BODY;
    private final String CATCH;
    private final String COMMAND;
    private final String CONDITION;
    private final String CONDITIONS;
    private final String EXPLICIT_TYPE;
    private final String FUNCTION_STACK_NAME;
    private final String GLOBAL;
    private final String IF;
    private final String INVOKE_ON;
    private final String JSON_ARRAY;
    private final String JSON_OBJECT;
    private final String LOCAL;
    private final String METHOD_NAME;
    private final String NEW;
    private final String RETURN_TO;
    private final String RETURN_TYPE;
    private final String RUNIN_UI_JSON;
    private final String STATE;
    private final String STATIC;
    private final String TO;
    private final String TYPE;
    private final String VALUE;
    private final String VALUE_GET;
    private final String VALUE_SET;
    private final String VOID;
    private final String WHILE;

    @NonNull
    private final HashMap<InflateView.Cmd, Constructor<?>> constructorCache;
    private final AtomicInteger idCounter;
    private final HashMap<String, HashMap<String, Object>> localState;

    /* loaded from: classes2.dex */
    public class Arguments {
        private final Object[] args;
        private Class<?>[] classTypes;

        public Arguments(JSONArray jSONArray, Object obj, LinkedList<String> linkedList) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                this.classTypes = new Class[0];
            }
            this.args = new Object[jSONArray.length()];
            this.classTypes = new Class[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                this.args[i10] = InflateJSON.this.getValue(jSONObject, obj, linkedList);
                this.classTypes[i10] = (Class) InflateJSON.this.getClassTypeFromObject(this.args[i10], jSONObject.optString("et"));
            }
        }
    }

    public InflateJSON(@NonNull DynamicUI dynamicUI) {
        super(dynamicUI);
        this.constructorCache = new HashMap<>();
        this.RUNIN_UI_JSON = "rj";
        this.JSON_ARRAY = "jsa";
        this.JSON_OBJECT = "jso";
        this.idCounter = new AtomicInteger(0);
        this.VALUE = "v";
        this.VOID = "vo";
        this.COMMAND = "c";
        this.CATCH = "ct";
        this.TYPE = "t";
        this.TO = "to";
        this.GLOBAL = "g";
        this.LOCAL = "lcl";
        this.STATE = "st";
        this.INVOKE_ON = "io";
        this.RETURN_TO = "rt";
        this.METHOD_NAME = "mn";
        this.ARGS = "a";
        this.NEW = "n";
        this.EXPLICIT_TYPE = "et";
        this.CONDITION = "cnd";
        this.CONDITIONS = "cnds";
        this.RETURN_TYPE = "rty";
        this.BODY = "bd";
        this.IF = "if";
        this.WHILE = "w";
        this.VALUE_SET = "vs";
        this.VALUE_GET = "vg";
        this.FUNCTION_STACK_NAME = "fnstk";
        this.STATIC = "stc";
        this.localState = new HashMap<>();
    }

    private Object createNewInstance(Class<?> cls, Object[] objArr, Class<?>[] clsArr) {
        Constructor<?> constructor;
        if (objArr == null || objArr.length == 0) {
            return cls.newInstance();
        }
        InflateView.Cmd cmd = new InflateView.Cmd(cls, "new", clsArr);
        if (this.constructorCache.containsKey(cmd)) {
            Constructor<?> constructor2 = this.constructorCache.get(cmd);
            Objects.requireNonNull(constructor2);
            return constructor2.newInstance(objArr);
        }
        Object obj = null;
        try {
            constructor = cls.getConstructor(clsArr);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        try {
            obj = constructor.newInstance(objArr);
        } catch (NoSuchMethodException unused2) {
            Constructor<?>[] constructors = cls.getConstructors();
            int i10 = 0;
            if (clsArr == null) {
                clsArr = new Class[objArr.length];
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    Object obj2 = objArr[i11];
                    if (obj2 != null) {
                        clsArr[i11] = obj2.getClass();
                    }
                }
            }
            int length = constructors.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                Constructor<?> constructor3 = constructors[i10];
                if (constructor3.getParameterTypes().length == objArr.length && matchTypes(constructor3.getParameterTypes(), clsArr)) {
                    obj = constructor3.newInstance(objArr);
                    constructor = constructor3;
                    break;
                }
                i10++;
            }
            this.constructorCache.put(cmd, constructor);
            return obj;
        }
        this.constructorCache.put(cmd, constructor);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <Any> Any getClassTypeFromObject(Object obj, @NonNull String str) {
        if (str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return (Any) obj.getClass();
        }
        Any any = (Any) createPrimitiveClass(str);
        return any == null ? (Any) Class.forName(str) : any;
    }

    private Field getField(Class<?> cls, String str) {
        return cls.getDeclaredField(str);
    }

    private Object getLocalStateValue(String str, LinkedList<String> linkedList) {
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            String next = descendingIterator.next();
            if (this.localState.containsKey(next)) {
                HashMap<String, Object> hashMap = this.localState.get(next);
                Objects.requireNonNull(hashMap);
                if (hashMap.containsKey(str)) {
                    HashMap<String, Object> hashMap2 = this.localState.get(next);
                    Objects.requireNonNull(hashMap2);
                    return hashMap2.get(str);
                }
            } else {
                throw new Exception(a3.a.f("local state not found for function ", next));
            }
        }
        return null;
    }

    private Object getStateValue(String str) {
        return this.state.get(str);
    }

    private Object invokeFunction(Method method, Object obj, Object[] objArr) {
        return objArr == null ? method.invoke(obj, new Object[0]) : method.invoke(obj, objArr);
    }

    private void saveOutput(Object obj, JSONObject jSONObject, LinkedList<String> linkedList) {
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.getString("to");
        String string2 = jSONObject.getString("v");
        if (string.equals("g")) {
            getDUI().setGlobalState(string2, obj);
        } else if (string.equals("lcl")) {
            setLocalStateValue(string2, obj, linkedList);
        } else {
            this.state.put(string2, obj);
        }
    }

    private void setLocalStateValue(String str, Object obj, LinkedList<String> linkedList) {
        HashMap<String, Object> hashMap = this.localState.get(linkedList.getLast());
        Objects.requireNonNull(hashMap);
        hashMap.put(str, obj);
    }

    public Object callFunction(String str, Object obj, Object[] objArr) {
        return callFunction(str, obj, objArr, null);
    }

    public Method findMethodInClassWithArgs(Class<?> cls, String str, Class<?>[] clsArr) {
        return findMethodWithCmd(new InflateView.Cmd(cls, str, clsArr));
    }

    public Class<?> getClassNameJSON(JSONObject jSONObject, Object obj) {
        String string = jSONObject.getString("t");
        String optString = jSONObject.optString("et");
        if (string.equals("stc")) {
            optString = jSONObject.getString("v");
        }
        if (!optString.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return getClassName(optString);
        }
        if (obj != null) {
            return obj.getClass();
        }
        throw new Exception("toRunOn is null");
    }

    public Object getValue(JSONObject jSONObject, Object obj, LinkedList<String> linkedList) {
        String string = jSONObject.getString("t");
        return string.equals("jsa") ? jSONObject.getJSONArray("v") : string.equals("jso") ? jSONObject.getJSONObject("v") : getValueNew(string, jSONObject.getString("v"), obj, linkedList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Any> Any getValueNew(String str, String str2, Object obj, LinkedList<String> linkedList) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 103:
                if (str.equals("g")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3681:
                if (str.equals("st")) {
                    c10 = 1;
                    break;
                }
                break;
            case 98855:
                if (str.equals("ctx")) {
                    c10 = 2;
                    break;
                }
                break;
            case 106965:
                if (str.equals("lcl")) {
                    c10 = 3;
                    break;
                }
                break;
            case 114210:
                if (str.equals("stc")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3237035:
                if (str.equals("infl")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3559070:
                if (str.equals("this")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return (Any) getDUI().getGlobalState(str2);
            case 1:
                return (Any) getStateValue(str2);
            case 2:
                Any any = (Any) this.dynamicUI.getActivity();
                return any == null ? (Any) this.dynamicUI.getAppContext() : any;
            case 3:
                return (Any) getLocalStateValue(str2, linkedList);
            case 4:
                return null;
            case 5:
                return this;
            case 6:
                return obj;
            default:
                return (Any) getValueNew(str, str2);
        }
    }

    public Object parseAndRunPipeJSON(Object obj, JSONArray jSONArray, boolean z10, LinkedList<String> linkedList) {
        Object obj2 = null;
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Object runCommandJSON = runCommandJSON(jSONObject, obj, z10, linkedList);
            if (jSONObject.has("rt")) {
                saveOutput(runCommandJSON, jSONObject.getJSONObject("rt"), linkedList);
            }
            i10++;
            obj2 = runCommandJSON;
        }
        return obj2;
    }

    @Override // in.juspay.hypersdk.core.InflateView
    public void parseKeys(String str, JSONObject jSONObject, Object obj, boolean z10) {
        try {
            if (str.equals("rj")) {
                runJSON(obj, jSONObject.getJSONArray("rj"), z10, null);
                return;
            }
        } catch (Exception e10) {
            this.dynamicUI.getLogger().e("WARNING", "Error in parsing new infl " + e10.getMessage());
        }
        super.parseKeys(str, jSONObject, obj, z10);
    }

    public Object runCommandJSON(JSONObject jSONObject, Object obj, boolean z10, LinkedList<String> linkedList) {
        Class<?> cls;
        Object obj2;
        Arguments arguments;
        String optString = jSONObject.optString("t", "c");
        JSONObject optJSONObject = jSONObject.optJSONObject("io");
        String optString2 = jSONObject.optString("mn", HttpUrl.FRAGMENT_ENCODE_SET);
        if (optJSONObject != null) {
            obj2 = getValue(optJSONObject, obj, linkedList);
            cls = getClassNameJSON(optJSONObject, obj2);
            arguments = new Arguments(jSONObject.optJSONArray("a"), obj, linkedList);
        } else {
            cls = null;
            obj2 = null;
            arguments = null;
        }
        optString.getClass();
        char c10 = 65535;
        switch (optString.hashCode()) {
            case 119:
                if (optString.equals("w")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3357:
                if (optString.equals("if")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3761:
                if (optString.equals("vg")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3773:
                if (optString.equals("vs")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                JSONArray jSONArray = jSONObject.getJSONArray("cnd");
                JSONArray jSONArray2 = jSONObject.getJSONArray("bd");
                while (true) {
                    Object runJSON = runJSON(obj, jSONArray, z10, linkedList);
                    if ((runJSON instanceof Boolean) && ((Boolean) runJSON).equals(Boolean.TRUE)) {
                        runJSON(obj, jSONArray2, z10, linkedList);
                    }
                }
                return null;
            case 1:
                JSONArray jSONArray3 = jSONObject.getJSONArray("cnds");
                for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i10);
                    Object runJSON2 = runJSON(obj, jSONObject2.getJSONArray("cnd"), z10, linkedList);
                    if ((runJSON2 instanceof Boolean) && ((Boolean) runJSON2).equals(Boolean.TRUE)) {
                        return runJSON(obj, jSONObject2.getJSONArray("bd"), z10, linkedList);
                    }
                }
                return null;
            case 2:
                Objects.requireNonNull(cls);
                return getField(cls, optString2).get(obj2);
            case 3:
                Objects.requireNonNull(cls);
                Field field = getField(cls, optString2);
                Objects.requireNonNull(arguments);
                field.set(obj2, arguments.args[0]);
                return null;
            default:
                if (optString2.equals("n")) {
                    Objects.requireNonNull(cls);
                    Objects.requireNonNull(arguments);
                    return createNewInstance(cls, arguments.args, arguments.classTypes);
                }
                Objects.requireNonNull(arguments);
                Method findMethodInClassWithArgs = findMethodInClassWithArgs(cls, optString2, arguments.classTypes);
                if (findMethodInClassWithArgs != null) {
                    return invokeFunction(findMethodInClassWithArgs, obj2, arguments.args);
                }
                throw new Exception("Method not found");
        }
    }

    public Object runJSON(Object obj, JSONArray jSONArray, boolean z10, LinkedList<String> linkedList) {
        Object obj2 = null;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                obj2 = parseAndRunPipeJSON(obj, jSONArray.getJSONArray(i10), z10, linkedList);
            } catch (Exception e10) {
                this.dynamicUI.getLogger().e("WARNING", "Error in parsing new infl " + e10.getMessage());
            }
        }
        return obj2;
    }

    public Object runProps(JSONObject jSONObject, String str, Object obj) {
        String str2;
        String name;
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("props");
        Iterator<String> keys = jSONObject3.keys();
        while (keys.hasNext()) {
            parseKeys(keys.next(), jSONObject3, obj, false);
        }
        Object obj2 = getState().get("rt");
        String string = jSONObject2.getString("rty");
        if (string.equals("vo")) {
            return null;
        }
        Class<?> cls = Class.forName(string);
        if (cls.isInstance(obj2)) {
            return obj2;
        }
        DuiLogger logger = getDUI().getLogger();
        StringBuilder l10 = v.e.l("return type mismatch for method ", str, " expected ", string, " got ");
        if (obj2 != null) {
            str2 = obj2.getClass().getName();
        } else {
            str2 = "result isnull";
        }
        l10.append(str2);
        logger.e("WARNING", l10.toString());
        Object runJSON = runJSON(obj, jSONObject2.getJSONArray("ct"), false, null);
        if (cls.isInstance(runJSON)) {
            return runJSON;
        }
        DuiLogger logger2 = getDUI().getLogger();
        StringBuilder l11 = v.e.l("return type mismatch for method on default", str, " expected ", string, " got ");
        if (runJSON == null) {
            name = "null";
        } else {
            name = runJSON.getClass().getName();
        }
        l11.append(name);
        logger2.e("WARNING", l11.toString());
        return null;
    }

    public Object callFunction(String str, Object obj, Object[] objArr, LinkedList<String> linkedList) {
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder p10 = da.e.p(str);
        p10.append(this.idCounter.getAndIncrement());
        String sb2 = p10.toString();
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        hashMap.put("fnstk", linkedList);
        this.localState.put(sb2, hashMap);
        linkedList.add(sb2);
        hashMap.put("a", objArr);
        Object runJSON = runJSON(obj, getDUI().getFunction(str), false, linkedList);
        linkedList.removeLast();
        this.localState.remove(sb2);
        return runJSON;
    }
}
