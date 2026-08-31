# Introduction to Kotlin and Android Development

[Course](https://firtman.github.io/intro-kotlin/)

## 1. Introduction

Native Clients -> Official SDKs -> Android -> Kotlin -> JetPack Compose -> Material Design

## 2. Android Overview

- Android -> Operating System

Layers -> Most of the App

- AOSP -> Android Open Source Project
- GMS -> Google Mobile Services
- Vendor OEM Software

Layer -> Huawei, Amazon

- AOSP -> Android Open Source Project
- Vendor OEM Software

Device Fragmentation

APK -> Android Package -> Zip

Zip -> Compiled VM Code + Meta data + assets + Signature

Installation

- Android Play store (AAB - Android App Bundle) -> Build apk by Play Store
- Enterprise -> internal employee
- Local

## 3. Android Version

Version -> one major per year

Code name deprecated from 10

API (SDK version) -> essential -> integer

Minimum SDK Version -> Installability -> Crash score

Target SDK Version -> Behavior -> Test Env -> Future

Compile SDK Version -> compiler version -> the newer the better

minSdk <= targetSdk <= compileSdk

the less sdk version, the few APIs

Support Libraries -> Framework with Polyfill to support backward compatibility -> JetPack -> AndroidX packages

SDK -> JavaVM (Not JVM of Oracle) -> own engine (Dalvik ART)

Java or Kotlin -> Java Byte Code -> Dalvik Executable -> Java VM -> NO native code (ndk is execeptional)

Garbage collector

## 4. Kotlin Overview

By JetBrains -> Android Studio

Open Source, Statically typed, Type Inference, Multiple Platform Language

Interpreted Languages -> Source Code
Intermediate Languages -> Bytecode (Kotlin)
Complied Languages -> Machine Code (Kotlin)

Android -> Intermediate Languages -> Bytecode (Kotlin)

JVM 6, JVM 8, Android Java DEX, JavaScript, Native iOS, Android

Kotlin Multi platform Mobile (KMM) for library

## 5. Kotlin Fundamentals

.kt -> kotlin
.kts -> kotlin scratch

semicolon optional

variable -> var

print -> console buffer , println -> new line

android does not support print, use println

conditional are expressions (if (x < 2>)) -> in replacement of ternary

when for switch, no break, else for default

loop -> while, for in

## 6. Variables & Types

Int, Byte, Short, Long, Float, Double, String, Char, Boolean, Any

var -> mutable -> js let
val -> immutable -> js const
const val -> constant -> attached to structure

== structural, === referential

string "", multi line """, support template expression as default $ or ${}

## 7. Collections

3 families -> List (ordered, duplicates ok), Set (unique), Map (key -> value)

each family -> read-only builder + mutable builder

```kotlin
List<Type> = listOf()
MutableList<Type> = mutableListOf()

Set<Type> = setOf()
MutableSet<Type> = mutableSetOf()

Map<K, V> = mapOf("a" to 1, "b" to 2)
MutableMap<K, V> = mutableMapOf()

emptyList(), buildList { add(1) }

ArrayDeque -> double ended queue -> stack / queue

hashSetOf(), hashMapOf() -> specific impl, no order guarantee
linkedSetOf(), sortedSetOf()

arrayOf() -> Array -> NOT a Collection -> fixed size, no add / remove, size + []
intArrayOf(), IntArray(5) -> primitives, no boxing -> mostly for Java interop
```

setOf / mapOf preferred over hashSetOf / hashMapOf -> Kotlin picks impl (LinkedHash\* -> insertion order kept)

`to` -> infix function -> builds Pair, not syntax

read-only != immutable -> listOf() is a view, underlying object can still be mutable -> same trap as val

no true immutable collections in stdlib

## 8. Null Safety

```kotlin
var name: String -> required
var optional: String? -> optional

optional.length -> optional?.length -> optional!!.length -> ?: default value
```

## 9. Functions & Lambada

```kotlin

fun name(arg: Type = default): ReturnType {
  return value
}

name(value)
name(arg=value) -> can switch order

fun name(): ReturnType = value

Type.isEvent() -> Value.isEvent()

() -> Type, Unit = { name -> }

one arg -> it

```

## 10. Classes

```kotlin
class Name {
  public var name = vLUE

}

Name() -> no new keyword

cannot extend as default -> use open and override

class A: B() {
 override fun A(){}
}

class N(val n: Type) -> primary constructor

var or val -> create property -> N.n

constructor(): this(){} -> secondary constructor

init {} -> initializer block

does not have static member but only one companion object

class N {
  companion object {
  }
}

property of companion object becomes static member in java

```

## 11. Others

```kotlin

interface Name {}

object Name {
  val name = value
}

sealed class -> class with companion object without instances -> for utils

enum class -> enum

data class -> class for holding data
```

## 12. Android Studio

Activity -> a screen

package name -> unique id for OS and Play Store

AndroidManifest.xml -> metadata for OS

Java/ -> source code

test/ -> unit test

androidTest/ -> ui test

res/ -> resources

gradle/ -> script build process

Android view, app view

MainActivity -> Entry Point

Preview -> Emulator

## 13. JetPack Compose

Android Xml is painful

Android Activity -> UI of OS

xml -> one activity per one screen

jetpack -> one activity with different views

theme -> design system -> ui.theme/

Composable -> UI component

Modifier -> function returns Composable -> use for Layout

Composition -> tree structure of Composable

Mutable State & Remember -> readonly by default

Composition local

Side effects -> Network calls

Dimension Unit -> px, dp, sp

px -> pixel

dp -> density-independent pixel pixel

sp -> scalable pixel -> font size

graphical assets -> png, svg -> svg is not supported by default -> change to Android vector format (xml based)

## 14. JetPack Compose

Composable -> UI component

function with @Composable -> TitleName -> emit other composables

@Preview -> for preview -> no bg by default

@Preview(showBackground = true) -> with bg

can have more than one preview

## 14. JetPack Modifiers

modifier -> padding, margin for composable -> chain of functions -> Modifier.padding(16.dp) -> import dp

order of modifier is important, can add multiple values, not like css

no margin -> use padding before bg

emit multiple composable -> stack on top of each other -> use container -> Column composable

Row composable -> row
Column composable -> column
Text composable -> text

Column -> lambda

can create custom modifier

## 15. TextField & Input Value

readonly by default

TextField(value, onValueChange)

var state = remember { mutableStateOf(value) } -> same as useState

remember -> like memo to save old data

state.value -> to get value

## 16. Project

import android -> sdk
import andoridx -> jetpack

use Kotlin Class/File template for new file

comp, prev -> shortcut

font -> args of text

fontSize -> use sp, fontStyle

style -> TextStyle -> defined in the theme -> can create design system

MaterialTheme.typography.h6

horizontalAlignment -> column

Spacer composable -> gap

color -> 0xFF43281C -> 0x long integer + ARGB

Theme -> dark and light

Build -> Clean project if necessary

assets -> res -> drawable

svg -> vector asset -> svg to xml

svg with text cannot imported

Image(painter = painterResource(R.drawable.file_name), contentDescription = "alt text")

reference in R object

fillMaxWidth -> image size

contentScale -> Fill, Crop

Column is not scrollable

Box -> div

Scaffold -> app layout -> AppTopBar

use AppNameTheme() for own theme

icon -> ImageVector -> Icons.Filled.Icon

click event -> use Modifier.clickable

horizontalArrangement = Arrangement.SpaceBetween

JetPack does not support navigation -> use JetPack Compose Navigation

new folder -> Packages
